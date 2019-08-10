import sun.reflect.generics.tree.Tree;

public class code_101_isSymmetric {
    //方法分迭代和递归两种
    public boolean isSymmetric(TreeNode root) {
        if (root == null){
            return true;
        }
        return false;
        }
    public static boolean isSymmetric(TreeNode t1, TreeNode t2){
        if (t1.left == null && t2.right == null){
            return true;
        }
        if (t1.left == null || t2.right == null){
            return false;
        }
        return t1.right.val == t2.left.val && isSymmetric(t1.left,t2.right) && isSymmetric(t1.right,t2.left);

    }
}
