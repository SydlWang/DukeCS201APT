import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

public class BigWord {
    public String most(String[] sentences) {
        ArrayList<String> list = new ArrayList<>();
        for(String s: sentences){
            list.addAll(Arrays.asList(s.toLowerCase().split(" ")));
        }
        int max = 0;
        String maxs = "";
        for(String j: list){
            int m = Collections.frequency(list, j);
            if(m > max){
                max = m;
                maxs = j;
            }
        }
        return maxs;
    }
}