import java.util.HashSet;
import java.util.*;

public class SortedFreqs {
    public int[] freqs(String[] data) {
        ArrayList <String> store = new ArrayList<>();
        store.addAll(Arrays.asList(data));
        TreeSet <String> rep = new TreeSet<String>();
        rep.addAll(store);

        int[] ret = new int[rep.size()];
        int count = 0;
        for (String a: rep){
            ret[count] = Collections.frequency(store, a);
            count++;
        }
        return ret;
    }
}