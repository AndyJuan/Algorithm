public class code_27_isSymmetryTree {
    boolean isSymmetrical(TreeNode pRoot){
        if (pRoot == null ) {
            return true;
        }
        return isSymmetrical(pRoot.left,pRoot.right);
    }

    public static boolean isSymmetrical(TreeNode root1, TreeNode root2){
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        if (root1.val != root2.val) {
            return false;
        }
        return isSymmetrical(root1.left,root2.right) && isSymmetrical(root2.left,root1.right);
    }

}
