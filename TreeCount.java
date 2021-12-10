
import java.util.*;

public class TreeCount {
    public int c = 0;
    public int count(TreeNode tree) {
        if(tree == null) {
            return 0;
        }
        c++;
        count(tree.left);
        count(tree.right);
        return c;
    }
}