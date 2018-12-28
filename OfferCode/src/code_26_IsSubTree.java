import java.io.BufferedWriter;

/**
 * 题目描述：
 * 输入两棵二叉树A和B，判断B是不是A的子结构。
 */
class BinaryTreeNode{
    BinaryTreeNode left;
    BinaryTreeNode right;
    int value;
    public BinaryTreeNode(int value){
        this.value = value;
    }

}
public class code_26_IsSubTree {
    //判断Tree1中是否含有Tree2
    public static boolean hasSubTree(BinaryTreeNode root1,BinaryTreeNode root2){
        boolean result = false;
        if (root1 != null && root2 != null ){
            if (root1.value == root2.value){
                result=doesTree1HasTree2(root1,root2);
            }
            if (!result){
                hasSubTree(root1.left,root2);
            }
            if (!result){
                hasSubTree(root1.right,root2);
            }
        }
        return result;
    }
    //在两个二叉树根节点相等情况下，Tree1中是否含有Tree2
    public static boolean doesTree1HasTree2(BinaryTreeNode root1, BinaryTreeNode root2){
        if (root2 == null){
            return true;
        }
        if (root1 == null){
            return false;
        }

        if (root1.value != root2.value){
            return false;
        }
        return doesTree1HasTree2(root1.left , root2.left) && doesTree1HasTree2(root1.right,root2.right);
    }
}
