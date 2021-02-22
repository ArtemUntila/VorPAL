import java.io.IOException;
import java.util.Map;

public abstract class Counter {

    abstract void parse() throws IOException;

    abstract int fields();

    abstract int overrides();

    abstract int classes();

    abstract int a();

    abstract int b();

    abstract int c();

    abstract Map<String, String> getMap();

}
