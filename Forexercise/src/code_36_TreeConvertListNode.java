public class code_36_TreeConvertListNode {
    private TreeNode pre = null;
    private TreeNode head = null;
    public TreeNode Convert(TreeNode pRootOfTree){
          inOrder(pRootOfTree);
          return head;
    }

    private void inOrder (TreeNode node){
        if (node == null)
            return;
        inOrder(node.left);
        node.left = pre;
        if (pre != null) {
            pre.right = node;
        }
        pre = node ;
        if (head == null) { //如果head == null , 那么head指向链表的头部
            head = node;
        }
        inOrder(node.right);
    }

}
