import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 1、如何仅用队列结构实现栈结构：两个队列实现一个栈结构
 * 2、如何仅用栈结构实现队列结构：两个栈实现一个队列结构
 * 在图的深度优先遍历中是用栈实现的，但是如果只给队列结构，怎么实现图的深度优先遍历，不要想着只用一个队列，
 * 先用两个队列结构拼出一个栈结构，再用栈结构实现图的深度优先遍历，用黑盒实现。
 */

public class code_09_StackAndQueueConvert {
    //两个栈实现队列，在对头删除，队尾插入
    public static class TwoStackQueue{
        private Stack<Integer> stackPush;
        private Stack<Integer> stackPop;

        public TwoStackQueue(){
            stackPush = new Stack<>();
            stackPop = new Stack<>();
        }
        //插入一个元素
        public void peek (int pushInt){
            stackPush.push(pushInt);
        }
   // 删除一个元素
        public int poll (){
            if(stackPop.empty() && stackPush.empty()){
                throw new RuntimeException("Queue is empty!");
            }else if (stackPop.empty()){
                while (!stackPush.empty()){
                    stackPop.push(stackPush.pop());
                }
            }
            return stackPop.pop();
        }
    }
//两个队列实现一个栈
    public static class TwoQueueStack{
        private Queue<Integer> queue;
        private Queue<Integer> help;

        public TwoQueueStack(){
            queue = new LinkedList<Integer>();
            help = new LinkedList<Integer>();
        }
//始终从data进，然后等进行删除之后，在把queue 和 helo交换一下
        public void push (int pushInt){
            queue.add(pushInt);
        }
//从栈中弹出
        public int pop (){
            if (queue.isEmpty()){
                throw new RuntimeException("Stack is empty");
            }
            while (queue.size()>1){
                help.add(queue.poll());
            }
            int res = queue.poll();
            swap();
            return res;
        }

        public void swap(){
            Queue<Integer> temp = help;
            help = queue;
            queue = temp;
        }
    }

    public static void main(String[] args) {
        System.out.println("两个栈实现一个队列");
        TwoStackQueue queue = new TwoStackQueue();
        queue.peek(1);
        queue.peek(2);
        queue.peek(3);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        System.out.println("两个队列实现一个栈");
        TwoQueueStack stack = new TwoQueueStack();
        stack.push(10);
        stack.push(11);
        stack.push(12);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
