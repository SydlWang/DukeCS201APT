import java.util.*;

public class LetterCountSort {
    String mySpecial;
    public int count(String w){
        int c = 0;
        for(char ch : w.toCharArray()) {
            if (mySpecial.indexOf(ch) >= 0) c++;
        }
        return c;
    }
    public String[] sort(String[] list, String specialChars) {
        mySpecial = specialChars;
        //System.out.println("hello "+mySpecial);
        Arrays.sort(list, Comparator
                .comparing(this::count).thenComparing(Comparator.naturalOrder()));
        return list;
    }
}
