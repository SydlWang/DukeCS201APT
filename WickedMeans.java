import java.util.*;

public class WickedMeans {
    public double[] mean(String[] data) {
        TreeMap<String, Integer> map = new TreeMap<>();
        List<String> rep = new ArrayList<>();
        List<String> sorted = Arrays.asList(data);
        Collections.sort(sorted);


        for (String a : sorted) {
            String[] store = a.split("::");
            if (!map.containsKey(store[0])){
                map.put(store[0], Integer.parseInt(store[1]));
            }
            else {
                map.replace(store[0], map.get(store[0]) + Integer.parseInt(store[1]));
            }
        }

        for (String b: sorted){
            String [] times = b.split("::");
            rep.add(times[0]);
        }

        int [] re = new int[map.size()];
        int counter = 0;
        for (String c: map.keySet()) {
            re [counter] = Collections.frequency(rep,c);
            counter ++;
        }


        double[] ret = new double[map.size()];
        int count1 = 0;
        for (String key : map.keySet()) {
            ret[count1] = map.get(key)/(double)re[count1];
            count1++;
        }
        return ret;
    }
}