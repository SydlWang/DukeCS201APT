public class NotATree {
    public String check(TreeNode root){
        if(root == null){
            return "not a tree";
        }
        if(root.left == null){
            return check(root.right);
        }
        if(root.right == null){
            return check(root.left);
        }
        return "is a tree";
    }
}
