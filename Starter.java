import java.util.Arrays;
import java.util.HashSet;

public class Starter {
    public int begins(String[] words, String first) {
        int counter = 0;
        char firstchar = first.charAt(0);
        HashSet<String> uniquewords = new HashSet (Arrays.asList(words));
        for(String a : uniquewords) {
            if (firstchar == a.charAt(0)) {
                counter++;
            }
        }
        return counter;
    }
}