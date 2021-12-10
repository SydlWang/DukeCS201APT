import java.util.*;

public class PathSum {
    public ArrayList<Integer> sum = new ArrayList<>();
    public int hasPath(int target, TreeNode tree){
        if (tree == null){
            return 0;
        }
        helper(tree, 0);
        if(sum.contains(target)){
            return 1;
        }
        return 0;
    }
    public void helper (TreeNode tree, int a){
        if (tree == null){
            return;
        }
        if(tree.left == null && tree.right == null){
            a += tree.info;
            sum.add(a);
            return;
        }
        a += tree.info;
        helper(tree.left, a);
        helper(tree.right, a);
    }
}