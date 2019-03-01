import java.util.ArrayList;

public class code_34_SumPath {
   private  ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target){
        findPath(root,target,new ArrayList<>());
        return ret;

    }

    private void findPath(TreeNode root, int target, ArrayList<Integer> path){
        if (root == null) {
            return;
        }
        path.add(root.val);
        target-=root.val;
        if (target == 0 && root.left == null && root.right == null) {
            ret.add(new ArrayList<>(path));
        }else {
            findPath(root.left,target,path);
            findPath(root.right,target,path);
        }
        path.remove(path.size()-1);
    }
}
