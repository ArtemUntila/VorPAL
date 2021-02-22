import java.util.Map;
import java.util.Set;

public class Depth { //глубина наследования

    private final Set<Map.Entry<String, String>> entries;
    private final int[] array;

    public Depth (Map<String, String> map) {
        this.entries = map.entrySet();
        array = new int[entries.size()];
    }

    private int counter = 0;

    public void depth() {
        int i = 0;
        for (Map.Entry<String, String> entry : entries) {
            depth(entry.getKey());
            array[i] = counter;
            i++;
            counter = 0;
        }
    }

    private void depth(String current) {
        for (Map.Entry<String, String> entry : entries) {
            if (entry.getKey().equals(current)) {
                counter++;
                depth(entry.getValue());
            }
        }
    }

    public int[] getArray() {
        return array;
    }
}
