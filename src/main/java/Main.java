import java.io.IOException;

public class Main { // источник словаря : https://github.com/shadrina/kotlin-grammar-antlr4

    public static void main(String[] args) throws IOException {

        if (args.length != 2)
            throw new IllegalArgumentException("Incorrect data entered");

        Params params = new Params(args[0]);
        int maxDepth = params.maxDepth();
        double avgDepth = params.avgDepth();
        double metricABC = params.metricABC();
        double avgOverrides = params.avgOverride();
        double avgFields = params.avgFields();

        Logger logger = new Logger(maxDepth, avgDepth, metricABC, avgOverrides, avgFields);

        logger.console();
        logger.log(args[1]);
    }
}