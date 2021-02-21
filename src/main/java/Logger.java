import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Logger {

    private final int maxDepth;
    private final double avgDepth;
    private final double metricABC;
    private final double avgOverrides;
    private final double avgFields;

    public Logger(int maxDepth, double avgDepth, double metricABC, double avgOverrides, double avgFields) {
        this.maxDepth = maxDepth;
        this.avgDepth = avgDepth;
        this.metricABC = metricABC;
        this.avgOverrides = avgOverrides;
        this.avgFields = avgFields;
    }

    public void console() {
        System.out.println(
                "maxDepth = " + maxDepth + "\n" +
                "avgDepth = " + avgDepth + "\n" +
                "metricABC = " + metricABC + "\n" +
                "avgOverrides = " + avgOverrides + "\n" +
                "avgFields = " + avgFields
        );
    }

    public void log(String filePath) throws IOException {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(this);

        BufferedWriter writer = Files.newBufferedWriter(Paths.get(filePath));
        writer.write(json);
        writer.close();

    }

}


