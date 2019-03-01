import java.util.Stack;

public class code_31_StackInOut {
    public boolean IsPopOrder(int [] pushA,int [] popA){
        if (pushA == null || popA == null || pushA.length != popA.length) {
            return false;
        }

        Stack<Integer> stack = new Stack<>();
        int n = pushA.length;
        for (int pushIndex = 0 , popIndex = 0; pushIndex < n; pushIndex++ ){
            stack.push(pushA[pushIndex]);
            while (popIndex < popA.length && !stack.isEmpty() && stack.peek() == popA[popIndex] ){
                stack.pop();
                popIndex++;
            }
        }
        return  stack.isEmpty();



    }

}
