import java.util.*;
public class LeafCollector {
    private List<String> leaves = new ArrayList<>();
    private List<String> ret = new ArrayList<>();

    public String[] values(TreeNode tree) {
        // replace with working code
        return null;
    }

    public boolean isLeaf(TreeNode root) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return true;
        }
        return false;
    }

    public void collectAndRemove(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        if (isLeaf(root.left)) {
            list.add(root.left.info);
        } else if (root.left != null) {
            collectAndRemove(root.left, list);
        }
        if (isLeaf(root.right)) {
            list.add(root.right.info);
        } else if (root.right != null) {
            collectAndRemove(root.right, list);
        }
    }
}



