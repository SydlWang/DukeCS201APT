import java.util.*;
public class Test {
   public int sum (int n) {
       int sum = 0;
       for (int k = 0; k <= n; k++){
           sum+=k;
       }
       return sum;
   }
   public void main()

    {
        System.out.println(sum(16));
    }
}
