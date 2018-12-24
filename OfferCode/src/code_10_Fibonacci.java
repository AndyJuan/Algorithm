/**描述：计算斐波那契数列的第n项。
        思路：使用循环从下往上计算数列。
        考点：考察对递归和循环的选择。使用递归的代码通常比循环简洁，但使用递归时要注意一下几点：1、函数调用的时间和空间消耗；
             2、递归中的重复计算；3、最严重的栈溢出。根据斐波那契数列递归形式定义很容易直接将代码写成递归，而这种方式有大量重复计算，效率很低。
*/
//此题解法也可用于青蛙跳台阶问题。
//        一只青蛙…次可以跳上l 级台阶，也可以跳上2 级台阶。求该青蛙跳
//        上一个n 级的台阶总共有多少种跳法。
public class code_10_Fibonacci {
    public static long fibonacci (int n ){
        if (n <= 1 ){
            return  n;
        }
        long fiboMinusOne = 0;
        long fibMinusTwo = 1;
        long fib = 0;
        for (int i = 2; i <= n ; i ++){
            fib = fibMinusTwo + fiboMinusOne;
            fiboMinusOne = fibMinusTwo;
            fibMinusTwo = fib;
        }
        return fib;

    }

    public static void main(String[] args) {
        System.out.println(fibonacci(0));
        System.out.println(fibonacci(1));
        System.out.println(fibonacci(2));
        System.out.println(fibonacci(50));

    }
}
