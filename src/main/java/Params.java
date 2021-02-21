import java.io.IOException;

public class Params { // выходные значения

    private final MainCounter mainCounter;
    private final Depth depth;

    public Params(String path) throws IOException {
        this.mainCounter = new MainCounter(path);
        mainCounter.parse();

        this.depth = new Depth(mainCounter.map);
        depth.depth();
    }

    public int maxDepth() {
        int max = 0;
        for (int i : depth.array) {
            if (i > max)
                max = i;
        }
        return max;
    }

    public double avgDepth() {
        int sum = 0;
        for (int i : depth.array) {
            sum += i;
        }
        return (double) sum / mainCounter.classes;
    }

    public double metricABC() {
        int a = mainCounter.a;
        int b = mainCounter.b;
        int c = mainCounter.c;
        return Math.sqrt(a * a + b * b + c * c);
    }

    public double avgOverride() {
        return (double) mainCounter.overrides / mainCounter.classes;
    }

    public double avgFields() {
        return (double) mainCounter.fields / mainCounter.classes;
    }

}