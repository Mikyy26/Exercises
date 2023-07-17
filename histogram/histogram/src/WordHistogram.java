import java.util.HashMap;
import java.util.Iterator;

public class WordHistogram extends HashMap <String, Integer> implements Iterable<String> {

    public WordHistogram(String string) {

        String[] split = string.split(" ");

        for (int i = 0; i < split.length; i++) {

            if (this.containsKey(split[i])) {

                this.put(split[i], this.get(split[i]) + 1);

            } else {
                this.put(split[i], 1);
            }

        }

    }

    @Override
    public Iterator iterator() {
        return this.keySet().iterator();
    }
}
