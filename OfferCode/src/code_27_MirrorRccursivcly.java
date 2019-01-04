/**
 * 描述：输入一个二叉树，作镜像变换👈👉。
 * 思路：即递归交换左右子树。
 * 考点：树的遍历算法的熟练掌握，这里用到的是前序遍历。
 */
class TreeNode{
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val){
        this.val = val;
    }
}

public class code_27_MirrorRccursivcly {
        public static void Mirror(TreeNode root){
            if (root == null || (root.left == null && root.right == null)){
                return;
            }
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;

            if (root.left !=null) {
               Mirror(root.left);
            }
            if (root.right !=null) {
                Mirror(root.right);
            }

    }
}
