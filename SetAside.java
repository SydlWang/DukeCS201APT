import java.util.ArrayList;
import java.util.TreeSet;
import java.util.List;
import java.util.Arrays;

public class SetAside {
    public String common(String[] list) {
        TreeSet a = new TreeSet(Arrays.asList(list[0].split(" ")));
        List <String> list2 = new ArrayList<>();
        for (int i = 1; i < list.length; i++) {
            TreeSet b = new TreeSet(Arrays.asList(list[i].split(" ")));
            a.retainAll(b);
        }
        return String.join(" ", a);
    }
}