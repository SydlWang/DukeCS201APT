import java.util.*;
public class UniqueTreeValues {
    public  TreeSet<Integer> unique = new TreeSet<>();
    public int[] unique(TreeNode root) {
        helper(root);
        int[] ret = new int[unique.size()];
        int count = 0;
        for(int a: unique){
            ret[count]=a;
            count++;
        }
        return ret;
    }
    public void helper (TreeNode root){
        if(root == null) return;

        unique.add(root.info);
        unique(root.left);
        unique(root.right);
    }
}