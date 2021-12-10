import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.*;

public class OverEnroll {
    public String[] popular(String[] data) {
        HashMap<String, Integer> map = new HashMap<>();

        int th = 0;

        for (String a : data) {
            String[] store = a.split(":");
                if (!map.containsKey(store[0])){
                    map.put(store[0], Integer.parseInt(store[2]));
                }
                else {
                    map.replace(store[0], map.get(store[0]) + Integer.parseInt(store[2]));
                }
        }
        // use .split to make an array put index 0 as key index 2 as value
        //if else inside for loop to make hashmap
        //return the values as a string

        int maxValueInMap=(Collections.max(map.values()));
        int minValueInMap=(Collections.min(map.values()));

        String[] ret = new String[2];
        int count1 = 0;
        for (String key : map.keySet()) {
            StringBuilder mapAsString = new StringBuilder();
            if (map.get(key) == maxValueInMap) {
                ret[0] = mapAsString.append(key + ":" + map.get(key)).toString();
            }
            else if (map.get(key) == minValueInMap){
                ret[1] = mapAsString.append(key + ":" + map.get(key)).toString();
            }
        }
        return ret;
    }
}