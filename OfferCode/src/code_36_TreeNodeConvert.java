import java.util.Stack;

/**
 * 目描述
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。
 *
 * 解法
 * 由于是二叉搜索树，因此中序遍历的结果就是排序的。
 *
 * 中序遍历利用栈来实现。遍历时，前一个结点的 right 指向后一个结点，后一个结点的 left 指向前一个结点。
 */

public class code_36_TreeNodeConvert {
    public TreeNode convert (TreeNode pRootOfTree){
        if (pRootOfTree == null){
            return null;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = pRootOfTree;
        TreeNode res = null;
        TreeNode pre = null;
        while (cur != null || !stack.isEmpty()){
            if (cur != null){
                stack.push(cur);
                cur = cur.left;
            }else {
                cur = stack.pop();
                if (pre == null){
                    pre = cur;
                    res = pre;
                }else {
                    pre.right = cur;
                    cur.left = pre;
                    pre = cur;
                }
                cur = cur.right;
            }
        }
        return  res;
    }

}
