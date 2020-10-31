package stack;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

class TreeNode{
    int val;
    TreeNode right;
    TreeNode left;
    TreeNode(){

    }

    TreeNode(int val){
        this.val = val;
    }

    TreeNode(int val , TreeNode right, TreeNode left){
        this.val = val;
        this.right = right;
        this.left = left;
    }
}
public class code_144_BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal1(TreeNode root) {
        List<Integer> list = new LinkedList<Integer>();
        if (root == null){
            return list;
        }

        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);

        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            list.add(node.val);

            if (node.right!= null){
                stack.push(node.right);
            }

            if (node.left!=null){
                stack.push(node.left);
            }
        }
        return list;
    }

    public List<Integer> preorderTraversal2(TreeNode root) {
        List<Integer> list = new LinkedList<Integer>();
        preOrder(root,list);
        return list;
    }

    public void preOrder(TreeNode root, List<Integer> list){
        if (root == null){
            return;
        }
        list.add(root.val);
        preOrder(root.left,list);
        preOrder(root.right,list);
    }

    //中序遍历
    public List<Integer> inOrderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<Integer>();
        if (root == null){
            return list;
        }

        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode cur = root;

        while (!stack.isEmpty() && cur !=null){

            while (cur!=null){
                stack.push(cur);
                cur = cur.left;
            }

            TreeNode node = stack.pop();
            list.add(node.val);

            if (node.right!= null){
                stack.push(node.right);
            }


        }
        return list;
    }

    // 后序遍历
    public List<Integer> postOrderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<Integer>();
        if (root == null){
            return list;
        }

        Stack<TreeNode> stack = new Stack<TreeNode>();
       stack.push(root);

        while (!stack.isEmpty() ){

            TreeNode node = stack.pop();
            stack.push(node);

            if (node.left != null){
                stack.push(node.left);
            }

            if (node.right !=null){
                stack.push((node.right));
            }
        }

        while (!stack.isEmpty()){
            list.add(stack.pop().val);
        }
        return list;
    }
}
