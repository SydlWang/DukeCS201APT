import java.util.ArrayList;
import java.util.List;

import java.util.*;

public class AlphaLength {
    public ListNode create (String[] words) {
        ListNode ret = new ListNode(0, null);
        List<String> list = new ArrayList<String>();
        List<Integer> list2 = new ArrayList<Integer>();
        list.addAll(Arrays.asList(words));
        Collections.sort(list);
        TreeSet <String> uniq = new TreeSet<>(list);

        for(String a: uniq){
            String [] count = a.split("");
            list2.add(count.length);
        }

        ListNode last = ret;
        for (Integer b: list2) {
            last.next = new ListNode(b, null);
            last = last.next;
        }
        return ret.next;
    }
}
