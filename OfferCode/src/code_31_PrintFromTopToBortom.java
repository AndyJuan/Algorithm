import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 不分行从上到下打印二叉树
 * 题目描述
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 *
 * 解法
 * 先将根节点进入队列。
 *
 * 队头元素出队，将值存入 list，判断该元素是否有左/右子树，有的话依次进入队列中。队列为空时结束。
 */

public class code_31_PrintFromTopToBortom {
    public ArrayList<Integer> printFromTopToButtom (TreeNode root){
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null){
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right !=null){
                queue.offer(node.right);
            }
            list.add(node.val);
        }
        return list;
    }

}
