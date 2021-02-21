import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

import java.io.IOException;
import java.util.Set;

public class Counter {

    private final CharStream charStream;
    private final KtLexer lexer;
    private final TokenStream tokens;
    private final KtParser parser;

    public Counter(String path) throws IOException {
        this.charStream = CharStreams.fromFileName(path);
        this.lexer = new KtLexer(charStream);
        this.tokens = new CommonTokenStream(lexer);
        this.parser = new KtParser(tokens);
        parser.kotlinFile();
    }

    int fields = 0;
    int overrides = 0;
    int classCounter = 0;
    int counterA = 0;
    int counterB = 0;
    int counterC = 0;

    public void parse() {

        int braces = 0;
        int classBraces = 0;
        boolean classBody;

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
            String prevName = tokens.get(i - 1).getText();
            String type = lexer.getVocabulary().getSymbolicName(tokens.get(i).getType());
            String name = tokens.get(i).getText();

            if (prevType.equals("CLASS") && type.equals("Identifier")) {
                classCounter++;
                classBraces++;
                System.out.println("classBraces = " + classBraces);
            }

            if (prevType.equals("LCURL"))
                braces++;
            if (prevType.equals("RCURL")) {
                braces--;
                if (braces < classBraces) {
                    classBraces = braces;
                    System.out.println("classBraces changed and = " + classBraces);
                }
            }

            //метрики
            if (metricA.contains(type))
                counterA++;
            if (metricC.contains(type))
                counterC++;
            if(type.equals("Identifier") && !prevType.equals("FUN")) {
                String nextType = lexer.getVocabulary().getSymbolicName(tokens.get(i + 1).getType());
                if (nextType.equals("LPAREN")) counterB++;
            }

            //переопределённые методы
            if (prevType.equals("OVERRIDE") && type.equals("FUN"))
                overrides++;

            //поля классов
            classBody = classBraces > 0 && braces == classBraces;
            if (classBody && ((prevType.equals("VAL") || prevType.equals("VAR")) && type.equals("Identifier"))) {
                    fields++;
                    System.out.println("Field: " + prevName + " " + name);
            }

        }
    }

}
