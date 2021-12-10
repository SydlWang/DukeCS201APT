import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;

public class Common {
    public int count (String a, String b) {
        int count = 0;
        int in = 0;
        String [] c = a.split("");
        String [] d = b.split("");
        List<String> one =  Arrays.asList(c);
        List<String> two = Arrays.asList(d);


        for(int i = 0; i< c.length; i++){
            if(two.contains(c[i])){

                    count++;
                
            }
        }


        return count;
    }
}
