import java.util.*;
public class ManyMany {
    public String[] filter(String[] data){
        Set <String> rep = new HashSet<String>();
        List<String> aList = new ArrayList<String>();



        // store split strings into a HashMap
        // find the instances where the values is more than 1 and delete the instances with 1

        //use Treemap (for sorting)
        //delete the stored values that are greater than 1 map.remove(key);
        for(String a: data){
            List<String> store = new ArrayList<>();
            TreeMap<String, Integer> map = new TreeMap<>();
            for (String g: a.split(" ")){
                if(!map.containsKey(g)){
                    map.put(g,0);
                }
                else{
                    map.replace(g, map.get(g)+1);
                }
            }
            for(String b: map.keySet()){
                if(map.get(b) >= 1){
                    store.add(b);
                }
            }
            aList.add(String.join(" ",store));
        }


        String ret[] = new String[aList.size()];
        for (int j = 0; j < aList.size(); j++) {
            ret[j] = aList.get(j);
        }
        return ret;
    }
}