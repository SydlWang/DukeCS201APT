import java.util.*;
public class TreeBuilder {
    public TreeNode helper(int [] values, int value){
        if (values == null){
            return null;
        }
        if (value >= values.length){
            return null;
        }
        if ((value * 2) + 2 >= values.length){
            return new TreeNode(values[value], helper(values, 2 * value + 1), null);
        }
        if((value *2) + 1 >= values.length){
            return new TreeNode(values[value], null, helper(values,2 * value + 2));
        }
        return new TreeNode (values[value], helper(values, 2 * value + 1),
                helper(values, 2 * value + 2));
    }

    public TreeNode create(int[] values) {
        return helper(values, 0);
    }
}