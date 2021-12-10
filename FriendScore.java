import java.util.*;
public class FriendScore {
    private TreeMap<Integer, List<Character>> graph = new TreeMap<>();
    private TreeMap<Integer, HashSet<Integer>> firstFriends = new TreeMap<>();
    private TreeMap<Integer, HashSet<Integer>> secondFriends = new TreeMap<>();
    public int highestScore(String[] friends) {
        for (int p = 0; p < friends.length; p++) {
            char[] v = friends[p].toCharArray();

            ArrayList<Character> values = new ArrayList<>();
            for (char a : v) {
                values.add(a);
            }

            graph.put(p, values);
        }
        first();
        second();
        int max = 0;
        for(int k: secondFriends.keySet()){
            if(secondFriends.get(k).size() > max){
                max = secondFriends.get(k).size()-1;
            }
        }
        return max;
    }
    public void first (){
        for(int i = 0; i < graph.size(); i++){
            firstFriends.putIfAbsent(i, new HashSet<Integer>());
            for(int k = 0; k < graph.size(); k++){
                if(graph.get(k).get(i) == 'Y'){
                    HashSet<Integer> a = firstFriends.get(i);
                    a.add(k);
                    firstFriends.put(i,a);
                }
            }
        }
    }
    public void second (){
        for(int j = 0; j < firstFriends.size(); j++){
            secondFriends.putIfAbsent(j,new HashSet<Integer>());
            for(int l: firstFriends.get(j)){
                secondFriends.get(j).addAll(firstFriends.get(j));
                secondFriends.get(j).addAll(firstFriends.get(l));
            }
        }
    }
}