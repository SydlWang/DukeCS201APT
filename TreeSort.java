import java.util.*;

public class TreeSort {
    private ArrayList<Integer> store = new ArrayList<>();
    public ArrayList<Integer> helper (TreeNode tree){
        if(tree == null){
            return new ArrayList<>();
        }
        store.add(tree.info);
        helper(tree.left);
        helper(tree.right);
        return store;
    }
    public int[] sort(TreeNode tree) {
        ArrayList<Integer> uns = helper(tree);
        Collections.sort(uns);
        int[] ret = new int[uns.size()];
        for(int i = 0; i < uns.size(); i++){
            ret[i]= uns.get(i);
        }
        return ret;
    }
}