public class OneValue {
    public int count(TreeNode tree) {
        if(tree == null){
            return 0;
        }
        if(tree.left == null && tree.right == null){
            return 1;
        }
        int sub = count(tree.left) + count(tree.right);
        int add = 0;
        if(helper(tree)){
            add = 1;
        }
        return sub + add;
    }
    public boolean helper(TreeNode tree){
        if (tree == null){
            return true;
        }
        if(!helper(tree.left) || !helper(tree.right)){
            return false;
        }
        int right = tree.info;
        int left = tree.info;
        if(tree.left != null){
            left = tree.left.info;
        }
        if(tree.right != null){
            right = tree.right.info;
        }
        return right == tree.info && left == tree.info;
    }
}