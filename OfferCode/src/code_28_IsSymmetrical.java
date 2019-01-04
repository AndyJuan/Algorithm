/**
 * 描述：判断树是不是对称的。
 * 思路：书上的分析过程能理解，而要准确无误地写出代码确实另一回事了。这里还是树的遍历。程序可以看成是两个树的比较，更有利于组织清晰的代码。
 * 考点：树的遍历。
 */

public class code_28_IsSymmetrical {
    public static boolean isSymmetrical(TreeNode root){
            return isSymmetrical(root,root);
    }

    public static boolean isSymmetrical(TreeNode root1, TreeNode root2){
            if (root1 == null && root2 == null){
                return  true;
            }
            if (root1 ==null || root2 == null){
                return  false;
            }
            if (root1.val != root2.val ){
                return false;
            }
            return isSymmetrical(root1.left,root2.right) && isSymmetrical(root1.right,root2.left);
    }
}
