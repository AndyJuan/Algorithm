/**
 * 面试题17 打印从1到最大n位数
 * 描述：输入数字n，按顺序打印出1到n的十进制数。
 * 思路：要意识到是大数问题，可移动符号运算以及数字排列输出两种方式解决。
 * 考点：对大数问题的处理；打印数字时要考虑到阅读的习惯。
 */


public class code_17_Print_1_ToMaxOfNDigits {
    public static void print1ToMaxOfDigits (int n ){
        if (n < 0) {
            return;
        }
        char[] num = new char[n];
        for (int i = 0; i < 10; i++) {
            num[0] = (char) (i + '0');
            printNumRec(num, n, 0);
        }
    }

    // 递归部分
    public static void printNumRec(char[] num, int n, int index) {
        if (index == n - 1) {
            printNum(num);
            return;
        }
        for (int i = 0; i < 10; i++) {
            num[index + 1] = (char) (i + '0');
            printNumRec(num, n, index + 1);
        }
    }

    // 以阅读习惯输出
    public static void printNum(char[] num) {
        boolean isBegin0 = true;
        for (int i = 0; i < num.length; i++) {
            if (isBegin0 && num[i] != '0') {
                isBegin0 = false;
            }
            if (!isBegin0) {
                System.out.print(num[i]);
            }
        }
        System.out.println();
    }

    // 测试
    public static void main(String[] args) {
        print1ToMaxOfDigits(2);
    }
}
