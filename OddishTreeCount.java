import java.util.*;
public class OddishTreeCount {
    public int count = 0;
    public int count(TreeNode tree) {
        return helper(tree);
    }
    public int helper (TreeNode tree){
        if(tree == null){
            return 0;
        }
        if(tree.info % 2 != 0){
            count ++;
        }
        helper(tree.left);
        helper(tree.right);
        return count;
    }
}