import java.util.TreeMap;
import java.util.*;

public class Ograph {
    Map<Integer, ArrayList<Integer>> myMap;
    public int[] components(String[] data) {
        createGraph(data);
        ArrayList<Integer> list = new ArrayList<>();
        Set<Integer> as = new HashSet<>();
        for(int vertex = 0; vertex < data.length; vertex++){
            if(!as.contains(vertex)) {
                Set<Integer> v = bfs(vertex);
                list.add(v.size());
                as.addAll(v);
            }
        }
        Collections.sort(list);
        int ret[] = new int[list.size()];
        for(int k = 0; k < list.size(); k++){
            ret[k]=list.get(k);
        }

        return ret;
    }
    private Set<Integer> bfs(int vertex) {
        Queue<Integer> q = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        q.add(vertex);
        visited.add(vertex);
        while (q.size()> 0){
            vertex = q.remove();
            for(Integer adj : myMap.get(vertex)) {
                if(!visited.contains(adj)){
                    q.add(adj);
                    visited.add(adj);
                }
            }
        }
        return visited;
    }
    private void createGraph(String[] data){
        myMap = new HashMap<>();
        for (int j = 0; j < data.length; j++){
            myMap.put(j, new ArrayList<>());
        }
        for (int i = 0; i < data.length; i++){
            int vertex = i;
            String [] adj = data[vertex].split(" ");
            for(String a: adj){
                myMap.get(vertex).add(Integer.valueOf(a));
            }
        }
    }

}



