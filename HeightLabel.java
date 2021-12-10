import java.util.*;

public class HeightLabel {
    public TreeNode rewire(TreeNode t) {
        if(t== null){
            return null;
        }
        return new TreeNode(helper(t), rewire(t.left), rewire(t.right));
    }
    public int helper(TreeNode t){
        if(t == null){
            return 0;
        }
        return Math.max(helper(t.left) + 1 , helper(t.right) + 1);
    }
}