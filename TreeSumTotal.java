public class TreeSumTotal {
    public int count(TreeNode tree, int target) {
        if(tree == null){
            return 0;
        }

        int sub = count(tree.left, target) + count(tree.right, target);
        int add = 0;

        if(helper(tree, target)){
            add = 1;
        }
        return sub + add;
    }
    public boolean helper(TreeNode tree, int target){
        if(tree == null && target == 0) return true;
        if(tree == null){
            return false;
        }
        if(tree.info == target){
            return true;
        }
        if(tree.left != null){
            if (tree.left.info + tree.info == target){
                return true;
            }
        }
        if(tree.right != null){
            if (tree.right.info + tree.info == target){
                return true;
            }
        }
        if(tree.left != null && tree.right != null){
            if (tree.info + tree.left.info + tree.right.info == target){
                return true;
            }
        }
        if (!helper(tree.left, target) || !helper(tree.left, target)){
            return false;
        }

        return false;
    }
}