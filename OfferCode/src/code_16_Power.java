/**
 * 面试题16 数值的整数次方
 * 描述：构造求数值的整数幂函数。
 * 思路：根据整数幂求解的特点，构造高效求解的函数；考虑幂为负整数的情形，以及避免溢出的处理；使用位运算进行除2和判断奇偶。像这种基本的数学函数，竭力提高运算性能总是有必要的。
 * 考点：对幂运算的掌握。时间复杂度O(logN)
 */

public class code_16_Power {
    // 幂运算函数，f=x^n，不用考虑大数问题，n可能为负整数
    public static double power(double  x, int n ){
        if (n< 0 ){
            return  1.0 / (x * power(x, -n-1));// 避免溢出
        }
        if (n == 0){
            return 1.0;
        }

        double result  = power(x, n >> 1 );// 位运算除2
        result *= result;
        if ((n & 1) == 1){// 位运算判断奇偶
            result = result * x;
        }
        return result;
    }

    // 测试
    public static void main(String[] args) {
        int a = -2147483648;
        System.out.println(power(1.0, a));
        System.out.println(power(2.0, 4));
        System.out.println(power(2.0, 3));

    }
}
