public class SumTwoTrees {
    public TreeNode helper(TreeNode a, TreeNode b){
        if(a == null){
            return b;
        }
        if(b == null){
            return a;
        }

        return new TreeNode((a.info + b.info),helper(a.left, b.left), helper(a.right, b.right));
    }
    public TreeNode add(TreeNode a, TreeNode b) {
        return helper(a,b);
    }
}