import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class CounterAttack {
    public int[] analyze(String str, String[] words) {
        int [] ret = new int [words.length];
        String [] find = str.split(" ");
        ArrayList <String>  sort= new ArrayList<>(Arrays.asList(find));

        for(int i = 0; i < words.length; i ++){
            ret[i] = Collections.frequency(sort, words[i]);
        }

        return ret;
    }
}
