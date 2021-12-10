import java.util.*;
public class PowerList {
    public ListNode temp = null;
    public int count = 0;
    public ListNode create (int n){
        if(n <= 1){
            return null;
        }
        int a = (int)Math.pow(2.0, count);
        if(a < n){
            count++;
            return new ListNode(a, create(n));
        }
        return null;
    }
}