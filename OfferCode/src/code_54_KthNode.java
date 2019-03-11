import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class code_54_KthNode {
    private TreeNode ret;
    private int cnt = 0;
    TreeNode KthNode(TreeNode pRoot, int k){
        inOrder(pRoot,k);
        return ret;
    }
    private void inOrder(TreeNode root, int k){
        if (root == null || cnt>= k){
            return;
        }
        inOrder(root.left,k);
        cnt++;
        if (cnt == k){
            ret = root;
        }
        inOrder(root.right,k);
    }
}
