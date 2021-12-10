import java.util.*;
public class LevelCount {
    public ArrayList<Integer> list = new ArrayList<>();
    public int count(TreeNode t, int level) {
        if (t == null){
            return 0;
        }
        if(level == 0){
            return 1;
        }
        helper(t, 0, level);
        return list.size();
    }
    public void helper (TreeNode t, int a, int b){
        if (t == null){
            return;
        }
        if(a >= b){
            list.add(t.info);
            return;
        }
        a++;
        helper(t.left, a, b);
        helper(t.right, a, b);
    }
}