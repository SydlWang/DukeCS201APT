import java.util.*;

public class HuffmanDecoding {
    HashMap<String, String> map = new HashMap<>();
    public String decode(String archive, String[] dictionary) {
        char key = 'A';
        for(String a: dictionary){
            String keys= String.valueOf(key);
            map.put(a, keys);
            key+=1;
        }
        int k = 0;
        String ret = "";
        for(int i = k; i<= archive.length(); i++){
            if(map.containsKey(archive.substring(k,i))){
                ret += map.get(archive.substring(k,i));
                k = i;
            }
        }
        return ret;
    }
}