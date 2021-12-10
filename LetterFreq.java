import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class LetterFreq {
    public String findFreqs(String[] words) {
        HashMap<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();
        List<String> list3 = new ArrayList<String>();
        String [] alp = {"a","b","c", "d", "e","f","g","h","i","j","k","l","m","n","o","p","q",
        "r","s","t","u","v","w","x","y","z"};
        for(String a: words){
            list.addAll(Arrays.asList(a.split("")));
        }
        list3.add(" ");
        list.removeAll(list3);
        Collections.sort(list);

        for (String d: alp){
            map.put(d,0);
        }


        for (String b: list){
            map.replace(b, map.get(b)+1);
        }

        for (Integer c: map.values()){
            list2.add(Integer.toString(c));
        }

        return String.join(":", list2);
    }
}