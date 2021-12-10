import java.util.*;

public class Closet {
    public String anywhere(String[] list) {
        ArrayList <TreeSet> store = new ArrayList<>();
        TreeSet a = new TreeSet(Arrays.asList(list[0].split(" ")));
        TreeSet ret = a;
        for (int i = 1; i < list.length; i++) {
            TreeSet b = new TreeSet(Arrays.asList(list[i].split(" ")));
            b.removeAll(ret);
            ret.addAll(b);
        }
        return String.join(" ", ret);
    }
}