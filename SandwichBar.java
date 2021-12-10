import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class SandwichBar {
    public int whichOrder(String[] available, String[] orders){
        int count = 0;
        List<String> ing=new ArrayList<String>();
        ing = Arrays.asList(available);
        List<String> list=new ArrayList<String>();


        for (int i =0; i <orders.length; i++){
            String [] copy = orders[i].split(" ");
            list =  Arrays.asList(copy);
            boolean ok = false;
            for (String a: list){
                if(!ing.contains(a)){
                    ok = true;
                }
            }
            if(!ok){
                return i;
            }
        }
        return -1;
    }
}
