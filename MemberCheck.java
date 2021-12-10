
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class MemberCheck {
    public String[] whosDishonest(String[] club1,
                                  String[] club2,
                                  String[] club3) {
        Set<String> result = new HashSet();
        Set<String> c1 = new HashSet<>(Arrays.asList(club1));
        Set<String> c2 = new HashSet<>(Arrays.asList(club2));
        Set<String> c3 = new HashSet<>(Arrays.asList(club3));

        result.addAll(intersection(c1, c2));
        result.addAll(intersection(c2, c3));
        result.addAll(intersection(c3, c1));
        String[] ret = result.toArray(new String [0]);
        Arrays.sort(ret);
        return ret;
    }
    public HashSet intersection(Set s1, Set s2){
        Set<String> a = new HashSet(s1);
        Set<String> b = new HashSet(s2);
        HashSet<String> both = new HashSet();
        for(String c: a){
            if(b.contains(c)){
                both.add(c);
            }
        }
        return both;
    }
}