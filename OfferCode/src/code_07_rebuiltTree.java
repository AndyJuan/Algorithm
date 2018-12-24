//面试题7  重建二叉树
//        描述：输入某二叉树的前序遍历和中序遍历结果，重建该二叉树。假设前序遍历或中序遍历的结果中无重复的数字。
//        思路：前序遍历的第一个元素为根节点的值，据此将中序遍历数组拆分为左子树+root+右子树，前序遍历数组拆分为root+左子树+右子树。再对左右子树进行同样的操作。
//        考点：对二叉树不同遍历方法的掌握。

 class Node {
    public int value;
    public Node left;
    public Node right;

    public Node() {

    }

    public Node(int data) {
        this.value = data;
    }


    //前序遍历输出
     public  void preList (){
         System.out.println(value);
         if (left != null)
             left.preList();

         if (right != null)
             right.preList();
     }

     //中序遍历输出
     public  void inList (){
         if (left != null)
             left.inList();
         System.out.println(value);
         if (right != null)
             right.inList();
     }

     //后序遍历输出
     public  void lastList (){
         if (left != null)
             left.lastList();
         if (right != null)
             right.lastList();
         System.out.println(value);
     }
}

public class code_07_rebuiltTree {

  //重建二叉树
        public static Node rebuiltTree (int[] preorder, int[] inorder){
            Node root = rebuiltTree(preorder, 0 ,preorder.length-1, inorder, 0, inorder.length-1);
            return root;
        }
        //重写函数
        public static Node rebuiltTree (int[] preorder, int startPre, int endPre, int[] inorder, int startIn, int endIn){
            if (startPre > endPre || startIn > endIn){
                return null;
            }
            Node root = new Node();
            root.value = preorder[startPre];
            for (int j= startIn; j <= endIn; j ++){
                if (inorder[j] == preorder[startPre]){
                    root.left = rebuiltTree(preorder, startPre+1, startPre + j -startIn, inorder, startIn, j-1);
                    root.right= rebuiltTree(preorder,startPre + j -startIn+1, endPre, inorder, j+1, endIn);
                }
            }
            return root;
        }

        public static void main(String[] args) {
            int[] preOrder = {1,2,4,7,3,5,6,8};
            int[] inOrder = {4,7,2,1,5,3,8,6};
            Node root = rebuiltTree(preOrder, inOrder);
            System.out.println("前序");
           root.preList();
            System.out.println("中序");
           root.inList();
            System.out.println("后序");
           root.lastList();
        }


}
