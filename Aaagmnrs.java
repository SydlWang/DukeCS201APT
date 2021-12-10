import java.util.*;
public class Aaagmnrs {
    public String[] anagrams(String[] phrases) {
        String[] switchs = new String[phrases.length];
        ArrayList <TreeSet> myWords = new ArrayList<>();
        ArrayList <String> words = new ArrayList<>();
        for (String v: phrases) {
            String s = v.toLowerCase().replaceAll(" ", "");
            TreeSet <String> tset = new TreeSet<>();
            for (int j = 0; j < s.length(); j++) {
                tset.add(s.substring(j, j + 1));
            }
            if(!myWords.contains(tset)){
                words.add(v);
                myWords.add(tset);
            }

        }
        String[] ret = words.toArray(new String[0]);
        return ret;

    }

}
