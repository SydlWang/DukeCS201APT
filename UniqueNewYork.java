import java.util.*;
public class UniqueNewYork {
    public int seen(String[] records) {
        Set <String> uniq = new HashSet<String>();
        for(String b: records){
            uniq.addAll(Arrays.asList(b.split(",")));
        }
        return uniq.size();
    }
}
