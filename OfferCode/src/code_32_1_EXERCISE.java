import com.sun.javafx.scene.control.skin.IntegerFieldSkin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class code_32_1_EXERCISE {
    public static ArrayList<Integer> printLayer (TreeNode head){
        if (head == null) {
            return new ArrayList<>();
        }
        Queue<TreeNode> queue  = new LinkedList<>();
        ArrayList<Integer> ret = new ArrayList<>();
        queue.add(head);
        while (!queue.isEmpty()){
            int cnt = queue.size();
            while (cnt-- > 0){
                TreeNode t = queue.poll();
                if (t == null) {
                    continue;
                }
                ret.add(t.val);
                queue.add(t.left);
                queue.add(t.right);
            }
        }
        return ret;
    }
}
