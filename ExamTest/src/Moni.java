

class TreeNode{
    int val ;
    TreeNode left=null ;
    TreeNode right =null ;
    public  TreeNode(int val ){
        this.val = val;


    }
}
public class Moni {
    public static  int count =0;
    public static int layer =1;
    private TreeNode creatTree(TreeNode root, int k){
        if (count <= 2*k-1){
            if (k == 0){
                root = null;
            }else {
                root.val = count;
                TreeNode left = new TreeNode(++count);
                TreeNode right = new TreeNode(++count);

                root.left = creatTree(left,left.val);
                root.right = creatTree(right,right.val);
            }
        }
        return root;
    }


}
