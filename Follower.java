import java.util.*;

// 2 nested loops
// first loop over the words with a regular for loop
// then second loop looking at one value loop through the whole list and compare it to the value to see if it is
// the same, then add that index to the array list
public class Follower {
    public int[] follows(String[] words) {
        List<Integer> aList1 = new ArrayList<Integer>();
        List<String> a = Arrays.asList(words);
        for (int j = 0; j < words.length; j++){
            for(int i = j+1; i < words.length; i++){
                if(words[j].equals(words[i])){
                    aList1.add(j);
                    break;
                }
            }
        }

        int[] ret = new int[aList1.size()];
        for(int i = 0; i < ret.length;i++) {
            ret[i] = aList1.get(i);
        }
        return ret;
    }
}