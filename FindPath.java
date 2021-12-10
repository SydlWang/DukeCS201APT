import java.util.*;
public class FindPath {
    public TreeMap<Integer, String> path = new TreeMap();
    public int count = 0;
    String mySpecial;
    public String path(TreeNode root, int target) {
        String p = "";
        helper(root, p, target);
        String[] s = new String[path.size()];
        int count = 0;

        if(path.size() == 0){
            return "nopath";
        }

        for(String a: path.values()){
            s[count]=a;
            count++;
        }

        Arrays.sort(s, Comparator
                .comparing(String:: length));
        return s[0];
    }
    public void helper(TreeNode root, String p, int target){
        if(root == null){
            return;
        }
        if(root.left != null){
            helper(root.left, p + "0", target);
        }
        if(root.right != null){
            helper(root.right, p + "1", target);
        }
        if(root.info == target){
            count++;
            path.putIfAbsent(count, p);
        }
    }
}