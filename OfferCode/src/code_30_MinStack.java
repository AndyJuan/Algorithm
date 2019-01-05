import java.util.Stack;

/**
 * 包含min函数的栈
 * 题目描述
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O(1)）。
 *
 * 解法
 * 定义两个stack。
 *
 * 压栈时，先将元素node压入stack1。然后判断stack2的情况：
 *
 * stack2栈为空或者栈顶元素大于node，则将node压入stack2中。
 * stack2栈不为空且栈定元素小于node，则重复压入栈顶元素。
 * 获取最小元素时，从stack2中获取栈顶元素即可。
 */

public class code_30_MinStack {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public void push(int node){
        stack1.push(node);
        if (stack2.isEmpty() || stack2.peek() >= node){
            stack2.push(node);
        }else {
            stack2.push(stack2.peek());
        }
    }

    public void pop(){
        if (!stack1.isEmpty() && !stack2.isEmpty()) {
            stack1.pop();
            stack2.pop();
        }
    }

    public int top(){
        return stack2.peek();

    }

    public int min(){
        return stack2.peek();

    }


}
