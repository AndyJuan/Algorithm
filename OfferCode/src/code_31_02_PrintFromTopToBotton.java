import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
/**
 * 题目描述
 * 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
 *
 * 解法
 * 与上一题类似，只不过需要用变量记录每一层要打印多少个节点。
 */


public class code_31_02_PrintFromTopToBotton {
    /**
     * 把二叉树打印成多行
     * @param pRoot 二叉树根节点
     * @return 结果list
     */
    ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        if (pRoot == null) {
            return list;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(pRoot);
        int cnt = 1;
        while (cnt > 0) {
            int num = cnt;
            cnt = 0;
            ArrayList<Integer> res = new ArrayList<>();
            for (int i = 0; i < num; ++i) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.offer(node.left);
                    ++cnt;
                }
                if (node.right != null) {
                    queue.offer(node.right);
                    ++cnt;
                }
                res.add(node.val);
            }
            list.add(res);
        }
        return list;
    }

}
