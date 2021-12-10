import java.util.HashSet;
import java.util.Arrays;

public class SimpleWordGame {
    public int points(String[] player,
                      String[] dictionary) {
        HashSet<String> i = new HashSet(Arrays.asList(dictionary));
        HashSet<String> d = new HashSet(Arrays.asList(player));
        d.retainAll(i);
        int length = d.size();

        int ret = 0;
        for (String l: d) {
            ret += l.length() * l.length();
        }
            return ret;
    }

}
