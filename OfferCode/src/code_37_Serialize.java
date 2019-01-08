/**
 * 面试题37：序列化二叉树
 * 题目要求：
 * 实现两个函数，分别用来序列化和反序列化二叉树。
 * 解题思路：
 * 此题能让人想到重建二叉树。但二叉树序列化为前序遍历序列和中序遍历序列，然后反序列化为二叉树的思路在本题有两个关键缺点：1.全部数据都读取完才能进行反序列化。2.该方法需要保证树中节点的值各不相同（本题无法保证）。
 * 其实，在遍历结果中，记录null指针后（比如用一个特殊字符$），那么任何一种遍历方式都能回推出原二叉树。但是如果期望边读取序列化数据，边反序列化二叉树，那么仅可以使用前序或层序遍历。但层序记录的null个数要远多于前序，因此选择使用记录null指针的前序遍历进行序列化。
 *
 * 作者：ryderchan
 * 链接：https://www.jianshu.com/p/61ec6618f792
 * 來源：简书
 * 简书著作权归作者所有，任何形式的转载都请联系作者获得授权并注明出处。
 */

public class code_37_Serialize {
    //前序遍历序列化
    public static String serialize (TreeNode root){
             if (root == null){
                 return "$,";
             }
             StringBuffer result = new StringBuffer();
             result.append(root.val);
             result.append(",");
             result.append(serialize(root.left));
             result.append(serialize(root.right));
             return result.toString();
    }
    //反序列化
//    public static TreeNode deserialize (String str){
//        StringBuilder stringBuilder = new StringBuilder(str);
//        return  deserialize(stringBuilder);
//    }
//
//    public static TreeNode deserialize(StringBuilder stringBuilder){
//        if (stringBuilder.length() == 0){
//            return null;
//        }
//        String num = stringBuilder.substring(0,stringBuilder.indexOf(","));
//        stringBuilder.delete(0,stringBuilder.indexOf(","));//删除0-逗号之间的元素，但不包括逗号所在的位置
//        stringBuilder.deleteCharAt(0);//删除“，”
//        if (num == "$"){
//            return null;
//        }
//        TreeNode node = new TreeNode(Integer.valueOf(num));
//        node.left = deserialize(stringBuilder);
//        node.right = deserialize(stringBuilder);
//        return node;
//    }
    public static int index = -1;
   public static TreeNode deserialize(String str) {
        String[] strr = str.split(",");
        int len = strr.length;
        index++;
        if(index >= len){
            return null;
        }
        TreeNode node = null;
        if(!strr[index].equals("$")){
            node = new TreeNode(Integer.valueOf(strr[index]));
            node.left = deserialize(str);
            node.right = deserialize(str);
        }

        return node;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left =new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);

        System.out.print("原始树： " );
        prePrint(root);
        System.out.println();
        String result = serialize(root);

        System.out.println("序列化结果： " +result);
        TreeNode deserializeRoot = deserialize(result);
        System.out.print("反序列结果： " );
        prePrint(deserializeRoot);

    }
   public static void prePrint(TreeNode root){
       if (root == null){
           return;
       }
       System.out.print(root.val);
       System.out.print(",");
       if (root.left != null){
           prePrint(root.left);
       }
       if (root.right != null){
           prePrint(root.right);
       }
   }
}
