import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
public class StringCuts {
    public String[] filter(String[] list, int minLength) {
        Set<String> h = new LinkedHashSet<>(Arrays.asList(list));
        Set<String> g = new LinkedHashSet<>();
        for(String b: h){
            if(b.length() >= minLength){
                g.add(b);
            }
        }
        String [] n = new String [g.size()];
        int count = 0;
        for(String l: g){
            n[count] = l;
            count ++;
        }

        return n;
    }
}
