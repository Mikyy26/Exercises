import java.util.HashMap;
import java.util.Iterator;

public class WordHistogramComposition implements Iterable<String> {

    HashMap<String, Integer> hashMap;

    public WordHistogramComposition(String string) {
        this.hashMap = new HashMap();

        String[] split = string.split(" ");

        for (int i = 0; i < split.length; i++) {

            if (hashMap.containsKey(split[i])) {

                hashMap.put(split[i], hashMap.get(split[i]) + 1);

            } else {
                hashMap.put(split[i], 1);
            }

        }

    }

    public int size() {

        int size = hashMap.size();

        return size;
    }

    public Integer get(String string) {

        return hashMap.get(string);
    }

    @Override
    public Iterator iterator() {
        return hashMap.keySet().iterator();
    }
}
