import org.apache.tools.ant.DirectoryScanner;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MainCounter extends Counter{ // счётчик параметров для всего проекта

    private final File project;

    public MainCounter(String path) {
        this.project = new File(path);
    }

    private int fields = 0; // кол-во полей
    private int overrides = 0; // кол-во переопеределённых методов
    private int classes = 0; // кол-во классов
    private int a = 0; // метрика A
    private int b = 0; // метрика B
    private int c = 0; // метрика C
    private final Map<String, String> map = new HashMap<>(); // Map с узлами <Имя класса-наследника, Имя наследуемого класса>

    @Override
    public void parse() throws IOException {

        if (!project.isDirectory() || !project.exists())
            System.err.println("Wrong path to the project folder");

        DirectoryScanner scanner = new DirectoryScanner();
        scanner.setIncludes(new String[]{"**\\*.kt"});
        scanner.setBasedir(project);
        scanner.scan();

        String[] ktFiles = scanner.getIncludedFiles();

        for (String ktFile : ktFiles) {

            File file = new File(project, ktFile);
            String path = file.getAbsolutePath();

            SubCounter subCounter = new SubCounter(path);
            subCounter.parse();

            fields += subCounter.fields();
            overrides += subCounter.overrides();
            classes += subCounter.classes();
            a += subCounter.a();
            b += subCounter.b();
            c += subCounter.c();
            map.putAll(subCounter.getMap());

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
