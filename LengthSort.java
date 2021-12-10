import java.util.*;

public class LengthSort {
    public String[] rearrange(String[] values){
        ArrayList<String> store = new ArrayList<>();
        store.addAll(Arrays.asList(values));
        Collections.sort(store);

        Comparator<String> comp = Comparator.comparing(String::length);

        Collections.sort(store,comp);

        String[] ret = new String[store.size()];
        int count = 0;
        for (String a: store){
            ret[count] = a;
            count++;
        }
        return ret;
    }
}