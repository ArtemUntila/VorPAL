import org.antlr.v4.runtime.*;
import org.apache.tools.ant.DirectoryScanner;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {

    private static CharStream charStream;

    static {
        try {
            charStream = CharStreams.fromFileName(
                    "D:\\UltimateIDEA\\KotlinAsFirst2019\\src\\lesson12\\task1\\PhoneBook.kt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static final KtLexer lexer = new KtLexer(charStream);
    private static final TokenStream tokens = new CommonTokenStream(lexer);
    private static final KtParser parser = new KtParser(tokens);

    public static void main(String[] args) throws IOException {
        parser.kotlinFile();
        /*File project = new File("D:\\UltimateIDEA\\KotlinAsFirst2019\\src\\lesson12\\task1\\PhoneBook.kt");
        charStream = CharStreams.fromFileName(project.getAbsolutePath());
        KtLexer lexer = new KtLexer(charStream);
        TokenStream tokens = new CommonTokenStream(lexer);
        KtParser parser = new KtParser(tokens);
        DirectoryScanner scanner = new DirectoryScanner();
        scanner.setIncludes(new String[]{"**\\*.kt"});
        System.out.println("Directory? " + project.isDirectory());
        System.out.println("Directory exists? " + project.exists());
        scanner.setBasedir(project);
        scanner.scan();
        String[] ktFiles = scanner.getIncludedFiles(); // тут должен быть foreach
        for (String ktFile : ktFiles) {
            File file = new File(project, ktFile);
            String path = file.getAbsolutePath();
            }
        */
        System.out.println("Running 'run()'\n\n\n");
        run();
        System.out.println("\n\n\nRunning 'fields()'\n\n\n");
        fields();
    }

    public static void fields() {
        int counter = 0;
        int bracesCounter = 0;
        int startIndex = 0;
        int classCounter = 0;
        boolean ok = false;

        for (int i = 1; i < tokens.size(); i++) {
            String prevType = lexer.getVocabulary().getSymbolicName(tokens.get(i - 1).getType());
            String prevName = tokens.get(i - 1).getText();
            if (prevType.equals("CLASS")) {
                String type = lexer.getVocabulary().getSymbolicName(tokens.get(i).getType());
                String name = tokens.get(i).getText();
                if (type.equals("Identifier")) {
                    System.out.println(
                            "Kotlin class founded = " + prevName + " " + name
                    );
                    startIndex = i + 1;
                    System.out.println("startIndex = " + startIndex + "\n");
                    break;
                }
            }
        }

        for (int i = startIndex; i < tokens.size(); i++) {
            String type = lexer.getVocabulary().getSymbolicName(tokens.get(i).getType());
            if (type.equals("LCURL")) {
                bracesCounter++;
                startIndex = i + 1;
                System.out.println(
                        "LCURL founded\nbracesCounter = " + bracesCounter + "\n"
                                + "startIndex = " + startIndex + "\n"
                );
                break;
            }
        }


        for (int i = startIndex + 1; i < tokens.size(); i++) {

            String prevType = lexer.getVocabulary().getSymbolicName(tokens.get(i - 1).getType());
            String prevName = tokens.get(i - 1).getText();

            if (prevType.equals("FUN")) {
                String name = tokens.get(i).getText();
                System.out.println("Founded fun : " + prevName + " " + name + "\n");
                startIndex = i + 2;

                for (int j = startIndex; j < tokens.size(); j++) { // +2 из-за скобок
                    String typeF = lexer.getVocabulary().getSymbolicName(tokens.get(j).getType());
                    if (typeF.equals("ASSIGNMENT")) {
                        startIndex = j + 1;
                        break;
                    }
                    if (typeF.equals("LCURL")) {
                        bracesCounter++;
                        System.out.println(
                                "LCURL founded\nbracesCounter = " + bracesCounter + "\n"
                                        + "Index = " + j + "\n"
                        );
                        startIndex = j + 1;
                        break;
                    }
                }

                while (bracesCounter != 1) {
                    String typeW = lexer.getVocabulary().getSymbolicName(tokens.get(startIndex).getType());
                    if (typeW.equals("LCURL")) {
                        bracesCounter++;
                        System.out.println(
                                "LCURL founded\nbracesCounter = " + bracesCounter + "\n"
                                        + "Index = " + startIndex + "\n"
                        );
                    }
                    if (typeW.equals("RCURL")) {
                        bracesCounter--;
                        System.out.println(
                                "RCURL founded\nbracesCounter = " + bracesCounter + "\n"
                                        + "Index = " + startIndex + "\n"
                        );
                    }
                    startIndex++;
                }

                i = startIndex;

            }

            if (prevType.equals("VAL") || prevType.equals("VAR")) {
                String type = lexer.getVocabulary().getSymbolicName(tokens.get(i).getType());
                String name = tokens.get(i).getText();
                if (type.equals("Identifier")) {
                    counter++;
                    System.out.println(
                            "Founded field : " + prevName + " " + name + "\n" + "Count = " + counter + "\n"
                    );
                }
            }

        }
    }

    /*public static boolean curls(String type, int counter) {
        if (type.equals("LCURL")) {
            counter++;
            return true;
        } else if (type.equals("RCURL")) {
            counter--;
            return true;
        } else return false;
    }*/
    public static void skipFun() {
    }

    public static void findClass() throws IOException {
        for (int i = 0; i < tokens.size() - 1; i++) {
            String tokenType = lexer.getVocabulary().getSymbolicName(tokens.get(i).getType());
            String tokenText = tokens.get(i).getText();
            String nextTokenType = lexer.getVocabulary().getSymbolicName(tokens.get(i + 1).getType());
            if (tokenType.equals("CLASS") && nextTokenType.equals("Identifier")) {
                System.out.println(
                        "Kotlin class founded. Proof:\ntokenType = " + tokenType + "\ntokenText = " + tokenText
                );
            }
        }
    }

    public static void run() throws IOException {
        /*DirectoryScanner scanner = new DirectoryScanner();
        scanner.setIncludes(new String[]{"**\\*.kt"});
        System.out.println("Directory exists = " + project.exists());
        System.out.println("Directory? " + project.isDirectory());
        scanner.setBasedir(project);
        scanner.scan();

        String[] ktFiles = scanner.getIncludedFiles();

        Arrays.stream(ktFiles).forEach(System.out::println);

        File file = new File(project, ktFiles[0]);
        System.out.println("Something new: ");
        System.out.println(file);

        System.out.println("ktFile Exists? " + file.exists());
        System.out.println("Is ktFile a Directory? " + file.isDirectory());
        System.out.println("Is ktFile a File? " + file.isFile());*/

        /*int counter = 0;

        for (String ktFile : ktFiles) {
            File f = new File(project, ktFile);
            BufferedReader reader = Files.newBufferedReader(Paths.get(f.getAbsolutePath()));
            String line = reader.readLine();
            while (line != null) {
                if (line.contains("mutableList")) counter++;
                line = reader.readLine();
            }
        }
        System.out.println("Count = " + counter);*/
        for (int i = 0; i < tokens.size(); i++) {
            String tokenText = tokens.get(i).getText();
            String lexerRule = lexer.getVocabulary().getSymbolicName(tokens.get(i).getType());
            if (!lexerRule.equals("NL")) //skipping NewLine tokens (for beauty)
                System.out.println(tokenText + "\t\t" + lexerRule);

            //Simple way
            //System.out.println(tokens.get(i).toString());
        }
    }
}