import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;
import java.util.*;

public class SortByFreqs {
    public String[] sort(String[] data) {
        ArrayList<String> store = new ArrayList<>();
        store.addAll(Arrays.asList(data));
        TreeSet<String> rep = new TreeSet<String>();
        rep.addAll(store);

        HashMap<String, Integer> map = new HashMap<>();
        for (String a: rep){
            if(!map.containsKey(a)) {
                map.put(a, Collections.frequency(store, a);
            }
        }

        List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, Map.Entry.comparingByValue(Comparator.reverseOrder()));

        String[] ret = new String[list.size()];
        int count = 0;
        for (Map.Entry<String, Integer> entry : list) {
            ret[count] = entry.getKey();
            count ++;
        }
        return ret;
    }
}