import java.util.ArrayList;

public class code_34_exercise {
    public static ArrayList<ArrayList<Integer>> ret = new ArrayList<>();

    public static ArrayList<ArrayList<Integer>> FindPath (TreeNode root, int target){
        backing(root , target, new ArrayList<>());
        return ret;
    }
    public static void backing(TreeNode root , int target, ArrayList<Integer> path){
        if (root == null )
            return;
        target -= root.val;
        path.add(root.val);
        if (target == 0 && root.left == null && root.right == null){
            ret.add(new ArrayList<>(path));
        }else{
            backing(root.left,target,path);
            backing(root.right,target,path);
        }
        path.remove(path.size()-1);
    }

}
