import java.util.ArrayList;

/**
 * 二叉树中和为某一值的路径
 * 题目描述
 * 输入一颗二叉树的根节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。(注意: 在返回值的list中，数组长度大的数组靠前)
 */

public class code_34_FindPath {
    //包含子ArrayList的ArrayList
    private ArrayList<ArrayList<Integer>> res = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> findPath (TreeNode root, int target){
            findPath(root, target, new ArrayList());
            return res;
    }

    private void findPath (TreeNode root, int target, ArrayList list ){
        if (root == null){
            return;
        }
        list.add(root.val);
        target -= root.val;
        if (target == 0 && root.left == null && root.right == null){
            res.add(new ArrayList<>(list));
        }else {
            findPath(root.left, target, list);
            findPath(root.right, target, list);
        }
        list.remove(list.size()-1);
    }
}
