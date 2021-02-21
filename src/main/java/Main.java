import org.antlr.v4.runtime.*;
import org.apache.tools.ant.DirectoryScanner;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {

        File project = new File("D:\\UltimateIDEA\\kotlin-project");
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
            Counter counter = new Counter(path);
            counter.parse();
            System.out.println("fields = " + counter.fields + "\n");
            System.out.println("overrides = " + counter.overrides + "\n");
            System.out.println("classes = " + counter.classCounter + "\n");
            System.out.println("metricA = " + counter.counterA + "\n");
            System.out.println("metricB = " + counter.counterB + "\n");
            System.out.println("metricC = " + counter.counterC + "\n");
        }
    }
}