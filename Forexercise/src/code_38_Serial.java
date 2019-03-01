public class code_38_Serial {
    private int index = -1;
    String Serialize(TreeNode root) {
        if (root == null) {
            return "#";
        }
        return root.val + " "+ Serialize(root.left)+" "+Serialize(root.left);

    }
    TreeNode Deserialize(String str) {
        String[] strr = str.split(" ");
        ++index;
        int len = strr.length;
        if (index >= len)
            return null;
        TreeNode head = null;
        if (!strr[index].equals("#")){
            head = new TreeNode(Integer.valueOf(strr[index]));
            head.left = Deserialize(str);
            head.right = Deserialize(str);
        }
        return head;
    }

}
