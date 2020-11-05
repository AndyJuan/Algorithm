package stack;

import java.util.Map;
import java.util.Stack;

public class code_155_minStack {
    /** initialize your data structure here. */
    Stack<Integer> help ;
    Stack<Integer> min ;

    public code_155_minStack() {
        help = new Stack<Integer>();
        min = new Stack<Integer>();
        min.push(Integer.MAX_VALUE);
    }

    public void push(int x) {
        help.push(x);
        min.push(Math.min(min.peek(),x)); 
    }

    public void pop() {
        help.pop();
        min.pop();
    }

    public int top() {
        return help.peek();
    }

    public int getMin() {
        return min.peek();
    }
}
