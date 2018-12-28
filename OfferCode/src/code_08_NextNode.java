import org.omg.CORBA.TRANSACTION_MODE;
import sun.reflect.generics.tree.Tree;

/**面试题8  二叉树的下一个节点
        描述：给定一棵二叉树和其中的一个节点，找出中序遍历序列的下一个节点。树中应定义指向左节点、右节点、父节点的三个变量。
        思路：该节点若存在右节点，右子树的最左节点则为下一节点；若不存在右节点，则向上遍历，直至找到是父节点的左节点的那个节点，该节点的父节点则为下一节点。
        考点：对中序遍历的理解。
*/
class TreeNode{
    public int value;
    public TreeNode left;
    public TreeNode right;
    public TreeNode parent;

    public TreeNode(int data){
        this.value = data;
    }
}
public class code_08_next {
    public static TreeNode findnext(TreeNode node){
        if (node == null){
            return node;
        }
        if (node.right != null) {
            return getLeftNode(node);
        }else {
            TreeNode parent = node.parent;
            while (parent != null && parent.left != node){
                node = parent;
                parent = node.parent;
            }
            return parent;
        }
    }

    public static TreeNode getLeftNode(TreeNode node){
        if (node == null ){
            return node;
        }
        while (node.left != null){
            node = node.left;
        }
        return node;
    }
    public static void main(String[] args) {
        TreeNode head = new TreeNode(6);
        head.parent = null;
        head.left = new TreeNode (3);
        head.left.parent = head;
        head.left.left = new TreeNode (1);
        head.left.left.parent = head.left;
        head.left.left.right = new TreeNode (2);
        head.left.left.right.parent = head.left.left;
        head.left.right = new TreeNode (4);
        head.left.right.parent = head.left;
        head.left.right.right = new TreeNode (5);
        head.left.right.right.parent = head.left.right;
        head.right = new TreeNode (9);
        head.right.parent = head;
        head.right.left = new TreeNode (8);
        head.right.left.parent = head.right;
        head.right.left.left = new TreeNode (7);
        head.right.left.left.parent = head.right.left;
        head.right.right = new TreeNode (10);
        head.right.right.parent = head.right;

        TreeNode  test = head.left.left;
        System.out.println(test.value + " next: " + findnext(test).value);
        test = head.left.left.right;
        System.out.println(test.value + " next: " + findnext(test).value);
        test = head.left;
        System.out.println(test.value + " next: " + findnext(test).value);
        test = head.left.right;
        System.out.println(test.value + " next: " + findnext(test).value);
        test = head.left.right.right;
        System.out.println(test.value + " next: " + findnext(test).value);
        test = head;
        System.out.println(test.value + " next: " + findnext(test).value);
        test = head.right.left.left;
        System.out.println(test.value + " next: " + findnext(test).value);
        test = head.right.left;
        System.out.println(test.value + " next: " + findnext(test).value);
        test = head.right;
        System.out.println(test.value + " next: " + findnext(test).value);
        test = head.right.right; // 10's next is null
        System.out.println(test.value + " next: " + findnext(test));
    }

}
