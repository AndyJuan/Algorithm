package stack;

import java.util.Stack;

public class code_20_ValidParentheses {
    // 使用栈的方法进行处理

    public boolean isValid(String s ){
        // 首先判断是否是偶数个字符
        if (s.length() % 2 == 1){
            return false;
        }

        Stack<Character> stack = new Stack();

        for(char c : s.toCharArray()){
            if (c == '(' || c == '{' || c == '['){
                stack.push(c);
            }else {
                if (stack.isEmpty()){
                    return false;
                }

                char spop = stack.pop();
                boolean b1 = c == ')' && spop == '(';
                boolean b2 = c == '}' && spop == '{';
                boolean b3 = c == ']' && spop == '[';
                // 如果不是满足上面三对的符号，则返回false
                if (!(b1 || b2 || b3)){
                    return false;
                }
            }
        }

        return stack.isEmpty();

    }
}
