/**
 * 描述：输入一个整数，计算该数二进制中1的个数。
 * 思路：方法一逐位上移，将1和整数进行与计算；方法二有点奇技淫巧的感觉了，需要想到整数-1后的二进制数特点。在Java里，可以通过Integer.toBinaryString函数查看整数的二进制形式。
 * 考点：对二进制的理解，和对位运算的掌握。
 *
 * 把一个整数减去l 之后再和原来的整数做位与运算，得到的结果相当
 * 于把整数的二进制表示中最右边的l 变成0。很多二进制的问题都可以用这
 * 种思路解决。
 */

public class code_15_NumberOf1 {
    //方法1：面试时候比较好的方法，用n-1与n进行与运算，直到on为0
    public static int numberOf1(int n ){

        int count =0;
        while (n!=0) {
            n = (n-1) & n;
            count++;
        }
        return count;
    }
//方法2： 用一个32位的整型，循环32次
    public static int numberOf1_2(int n ) {
        int flag = 1;
        int count =0;

        while (flag != 0){
            if ((n & flag) != 0)
                count++;
            flag = flag <<1;
    }
         return count;
    }

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(10000));
        System.out.println(numberOf1(10000));
        System.out.println(numberOf1_2(10000));

        System.out.println(Integer.toBinaryString(0));
        System.out.println(numberOf1(0));
        System.out.println(numberOf1_2(0));

        System.out.println(Integer.toBinaryString(1));
        System.out.println(numberOf1(1));
        System.out.println(numberOf1_2(1));

        System.out.println(Integer.toBinaryString(-1));
        System.out.println(numberOf1(-1));
        System.out.println(numberOf1_2(-1));
    }
}

/**相关题目1：
 * 用一条语句判断一个整数是不是2 的整数次方。一个整数如果是2
 * 的整数次方，那么它的二进制表示中有且只有一位是l ， 而其他所
 * 有位都是0 。根据前面的分析，把这个整数减去l 之后再和它自己
 * 做与运算，这个整数中唯一的l 就会变成0 。
 *
 * 相关题目2：
 * 输入两个整数m 和l n，计算需要改变m 的二进制表示中的多少位
 * 才能得到n 。比如1 0 的二进制表示为1 010, 1 3 的二进制表示为
 * 1101 ， 需要改变1010 中的3 位才能得到l 10 1 。我们可以分为两步
 * 解决这个问题： 第一步求这两个数的异或； 第二步统计异或结果中
 * l 的位数。 （异或之后，统计m和n有多少个1不同，这样就知道哦啊要改变多少位）
 */