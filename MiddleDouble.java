import java.util.*;
public class MiddleDouble {
    public ListNode change(ListNode list) {
        ArrayList<Integer> to = new ArrayList<>();
        to = edit(list);

        ListNode point = new ListNode(to.get(0));
        ListNode temp = point;
        for(int i = 1; i < to.size(); i++){
            temp.next = new ListNode(to.get(i));
            temp = temp.next;
        }
        return point;
    }
    public int middle (ListNode list){
        int count = 0;
        int ret = 0;
        while(list != null){
            count ++;
            list = list.next;
        }
        ret = count/2;
        return ret;
    }
    public ArrayList<Integer> toArray (ListNode list){
        ArrayList<Integer> ret = new ArrayList<>();
        while(list != null){
            ret.add(list.info);
            list = list.next;
        }
        return ret;
    }
    public ArrayList<Integer> edit (ListNode list){
        ArrayList<Integer> copy = new ArrayList<>();
        ArrayList<Integer> ret = new ArrayList<>();
        ret = toArray(list);
        copy = toArray(list);


        int mid = middle(list);

        ret.remove(mid);
        copy.remove(mid);
        ret.addAll(copy);

        return ret;
    }
}