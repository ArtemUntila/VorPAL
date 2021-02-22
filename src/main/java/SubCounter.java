import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SubCounter extends Counter { // счётчик параметров для одного .kt файла

    private final KtLexer lexer;
    private final TokenStream tokens;

    public SubCounter(String path) throws IOException {
        CharStream charStream = CharStreams.fromFileName(path);
        this.lexer = new KtLexer(charStream);
        this.tokens = new CommonTokenStream(lexer);
        KtParser parser = new KtParser(tokens);
        parser.kotlinFile();
    }

    private int fields = 0; // кол-во полей
    private int overrides = 0; // кол-во переопеределённых методов
    private int classes = 0; // кол-во классов
    private int a = 0; // метрика A
    private int b = 0; // метрика B
    private int c = 0; // метрика C
    private final Map<String, String> map = new HashMap<>(); // Map с узлами <Имя класса-наследника, Имя наследуемого класса>

    @Override
    public void parse() {

        int braces = 0;
        int classBraces = 0;
        boolean classBody;
        boolean classParam = false;

        Set<String> metricA = Set.of(
                "ASSIGNMENT", "ADD_ASSIGNMENT", "SUB_ASSIGNMENT", "MULT_ASSIGNMENT", "DIV_ASSIGNMENT", "MOD_ASSIGNMENT",
                "INCR", "DECR"
        );

        Set<String> metricC = Set.of(
                "LANGLE", "RANGLE", "LE", "GE", "EXCL_EQ", "EQEQ", "EXCL_EQEQ", "EQEQEQ", "QUEST", "ELSE", "TRY",
                "CATCH", "WHEN", "IF"
        );

        for (int i = 1; i < tokens.size(); i++) {

            String prevType = lexer.getVocabulary().getSymbolicName(tokens.get(i - 1).getType());
            String type = lexer.getVocabulary().getSymbolicName(tokens.get(i).getType());
            String name = tokens.get(i).getText();

            if (prevType.equals("CLASS") && type.equals("Identifier")) {

                classes++;
                classBraces++;

                String nextType = lexer.getVocabulary().getSymbolicName(tokens.get(i + 1).getType());
                if (nextType.equals("COLON") && i < tokens.size() - 3) {
                    String extendedClass = tokens.get(i + 2).getText();
                    String typeL = lexer.getVocabulary().getSymbolicName(tokens.get(i + 3).getType());
                    if (typeL.equals("LPAREN"))
                        map.put(name, extendedClass);
                }

                if (nextType.equals("LPAREN")) // исключаются параметры класса val и var
                    classParam = true;

            }

            if (type.equals("RPAREN") && classParam)
                classParam = false;

            if (prevType.equals("LCURL"))
                braces++;

            if (prevType.equals("RCURL")) {
                braces--;
                if (braces < classBraces)
                    classBraces = braces;
            }

            //метрики
            if (metricA.contains(type) && i > 1) { // исключаются символы "=" при первом объявлении переменной val или var
                String prev2Type = lexer.getVocabulary().getSymbolicName(tokens.get(i - 2).getType());
                if ((!prev2Type.equals("VAL") && !prev2Type.equals("VAR")) && prevType.equals("Identifier"))
                    a++;
            }

            if (metricC.contains(type)) c++;

            if(type.equals("Identifier") && i < tokens.size() - 1 &&
                    !prevType.equals("FUN") && !prevType.equals("CLASS")) {
                String nextType = lexer.getVocabulary().getSymbolicName(tokens.get(i + 1).getType());
                if (nextType.equals("LPAREN"))
                    b++;
            }

            //переопределённые методы
            if (prevType.equals("OVERRIDE") && type.equals("FUN"))
                overrides++;

            //поля классов
            classBody = classBraces > 0 && braces == classBraces;

            if (classBody && !classParam &&
                    ((prevType.equals("VAL") || prevType.equals("VAR")) && type.equals("Identifier")))
                fields++;

        }

    }

    @Override
    int fields() {
        return fields;
    }

    @Override
    int overrides() {
        return overrides;
    }

    @Override
    int classes() {
        return classes;
    }

    @Override
    int a() {
        return a;
    }

    @Override
    int b() {
        return b;
    }

    @Override
    int c() {
        return c;
    }

    @Override
    Map<String, String> getMap() {
        return map;
    }

}
