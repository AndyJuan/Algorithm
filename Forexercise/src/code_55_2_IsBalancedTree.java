public class code_55_2_IsBalancedTree {
    private Boolean IsBalanced = true;
    public boolean IsBalanced_Solution(TreeNode root){
        IsBalance(root);
        return IsBalanced;
    }
    private int IsBalance (TreeNode root){
        if (root == null || !IsBalanced)
            return 0;
        int left = IsBalance(root.left);
        int right = IsBalance(root.right);
        if (Math.abs(left - right)>1)
            IsBalanced = false;
        return 1+Math.max(left,right);
    }

}
