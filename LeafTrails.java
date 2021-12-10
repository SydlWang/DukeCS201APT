import java.util.*;
public class LeafTrails {
    public TreeMap<Integer, String> myMap = new TreeMap<>();
    public String[] trails(TreeNode tree) {
        String v = "";
        helper(tree, v);
        String[] ret = new String[myMap.size()];
        int count = 0;

        for(String a: myMap.values()){
            ret[count]=a;
            count++;
        }
        return ret;
    }
    public void helper (TreeNode tree, String value){
        if (tree == null){
            return;
        }
        helper(tree.left, value + "0");
        helper(tree.right, value + "1");
        if(tree.left == null && tree.right == null){
            myMap.putIfAbsent(tree.info, value);
        }
    }

}