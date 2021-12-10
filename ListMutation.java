import java.util.*;
public class ListMutation {
    public ListNode alter(ListNode list) {
        if(list == null){
            return null;
        }
        ListNode after = alter(list.next);
        if(list.info % 2 != 0){
            return after;
        }
        return new ListNode(list.info, new ListNode(list.info,after));
    }
}