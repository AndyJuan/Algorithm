import java.util.Stack;

/**栈的压入、弹出序列
 * 题目描述
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断
 * 第二个序列是否可能为该栈的弹出顺序。假设压入栈的所有
 * 数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，序
 * 列4,5,3,2,1是该压栈序列对应的一个弹出序列，但4,3,5,
 * 1,2就不可能是该压栈序列的弹出序列。（注意：这两个序
 * 列的长度是相等的）
 *
 * 解法
 * 判断下一个要弹出的元素：
 *
 * 如果刚好是栈顶元素，直接弹出。
 * 如果不在栈顶，则把压栈序列中还没有入栈的数字压入栈，
 * 直到待弹出的数字压入栈顶。
 * 如果所有数字都压入栈顶后依然没有后找到下一个弹出的
 * 数字，则不可能是弹出序列。
 */

public class code_31_lsPopOrder {
    /**
     * 判断是否是弹出序列
     * @param pushA 压栈序列
     * @param popA 弹栈序列
     * @return 是否是弹出序列
     */
     public boolean isPopOrder (int[] pushA, int[] popA){
         if (pushA == null || popA == null || pushA.length !=popA.length){
             return false;
         }
         Stack<Integer> stack = new Stack<>();
         int i = 0 ;
         int n = pushA.length;
         boolean flag = false;
         for (int val : popA ){
             while (stack.isEmpty() || stack.peek() !=val){
                 if (i >= n){
                     flag = true;
                     break;
                 }
                 stack.push(pushA[i++]);
             }
             if (flag) {
                 break;
             }
             stack.pop();
         }
         return stack.isEmpty();
     }

}
