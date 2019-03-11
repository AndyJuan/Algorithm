public class code_51_1_TreeDepth {
    public int TreeDepth(TreeNode root){
        if (root == null)
            return 0;
        return (root == null) ? 0 : 1+Math.max(TreeDepth(root.left),TreeDepth(root.right));
    }
}
