import java.util.*;
public class TreeTighten {
    public TreeNode tighten(TreeNode t) {
        if (t == null) {
            return null;
        }
        if (t.left != null && t.right == null) {
            t = tighten(t.left);
        }
        if (t.right != null && t.left == null) {
            t = tighten(t.right);
        }
        if (t.right != null && t.right != null) {
            t.left = tighten(t.left);
            t.right = tighten(t.right);
            return t;
        }
        return t;
    }
}