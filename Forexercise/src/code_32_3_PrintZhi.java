import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class code_32_3_PrintZhi {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot){
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
        boolean reserve = false;
        queue.add(pRoot);
        while (!queue.isEmpty()){
            ArrayList<Integer> list = new ArrayList<>();
            int cnt = queue.size();
            while (cnt-->0){//--cnt就不行
                TreeNode t = queue.poll();
                if (t == null) {
                    continue;
                }
                list.add(t.val);
                queue.add(t.left);
                queue.add(t.right);
            }
            if (reserve){
                Collections.reverse(list);
            }
            reserve = !reserve;
            if (list.size() != 0){
                ret.add(list);
            }

        }
        return ret;
    }
}
