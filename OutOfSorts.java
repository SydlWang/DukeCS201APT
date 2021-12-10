import java.util.HashSet;
import java.util.Set;
import java.util.*;

public class OutOfSorts {
    public int[] ordered(String[] words) {
        List<String> rep = Arrays.asList(words);
        List<String> sort = rep;
        List<Integer> str = new ArrayList<Integer>();
        Collections.sort(sort);


        for (int i = 0; i < words.length; i++){
            for (int j = 0; j < words.length; j++){
                if(rep.get(i).equals(sort.get(j)) && i > j){
                        str.add(i);
                        break;
                }
            }
        }

        int[] ret = new int[str.size()];
        for(int i = 0; i < ret.length;i++) {
            ret[i] = str.get(i);
        }
        return ret;
    }
}