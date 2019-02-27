
 class TreeNode {
 int val = 0;
 TreeNode left = null;
 TreeNode right = null;

 public TreeNode(int val) {
 this.val = val;

 }
 }

public class code_26_subTree {
    public boolean HasSubtree(TreeNode root1,TreeNode root2){
        if (root1 == null || root2 == null) {
            return false;
        }
        return isSubTree(root1,root2) || HasSubtree(root1.left,root2) || HasSubtree(root1.right,root2);

    }

    public static boolean isSubTree (TreeNode root1, TreeNode root2){
        if (root2 == null){//这两个if还不能换顺序
            return true;
        }
        if (root1 == null) {
            return false;
        }

        if (root1.val != root2.val) {
            return false;
        }
        return isSubTree(root1.left,root2.left) && isSubTree(root1.right,root2.right);

    }
}
