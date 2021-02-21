import org.apache.tools.ant.DirectoryScanner;

import java.io.File;
import java.io.IOException;

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

        int fields = 0;
        int overrides = 0;
        int classes = 0;
        int a = 0;
        int b = 0;
        int c = 0;

        for (String ktFile : ktFiles) {
            File file = new File(project, ktFile);
            String path = file.getAbsolutePath();
            Counter counter = new Counter(path);
            counter.parse();
            fields += counter.fields;
            overrides += counter.overrides;
            classes += counter.classes;
            a += counter.a;
            b += counter.b;
            c += counter.c;
            System.out.println("fields = " + fields + "\n");
            System.out.println("overrides = " + overrides + "\n");
            System.out.println("classes = " + classes + "\n");
            System.out.println("metricA = " + a + "\n");
            System.out.println("metricB = " + b + "\n");
            System.out.println("metricC = " + c + "\n");
        }
    }

    public static void getParams() {

    }
}