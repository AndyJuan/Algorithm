/**
 *  题目描述
 * 数字以 0123456789101112131415… 的格式序列化到一个字符序列中。
 *
 * 在这个序列中，第 5 位（从 0 开始计数）是 5，第 13 位是 1，第 19 位是 4，等等。
 *
 * 请写一个函数求任意位对应的数字。
 *
 * 解法
 * 举个栗子，求序列第 1001 位。
 *
 * 序列的前 10 位是 0~9， 这 10 个只有一位的数字。显然第 1001 位在这 10 个数字之后，因此
 * 这 10 个数字可以直接跳过。再从后面序列中找第 991（991=1001-10） 位的数字。接下来有 90
 * 个两位数，共 180 位，由于 991>180，所以继续跳过。从 881 找...最后可以找到对应的数字以
 * 及数字的某一位。
 */

public class code_44_DigitAtIndex {
    /**
     * 求数字序列中某一位的数字
     *
     * @param n 第n位
     * @return 第n位的数字
     */
    public int digitAtIndex(int n) {
        if (n < 0) {
            return -1;
        }
        int digits = 1;
        while (true) {
            long numbers = countOfIntegers(digits);
            if (n < digits * numbers) {
                break;
            }
            n -= numbers * digits;
            ++digits;
        }
        return digitAtIndex(digits, n);

    }
    //m位数字总共有多少位
    private long countOfIntegers(int digits) {
        return digits == 1
                ? 10
                : (int) (9 * Math.pow(10, digits - 1));
    }

    //当我们知道要找的那一位数字 n 位于某 digits位数之中后， 就可以用如
    //下找出那一位数字：
     private int digitAtIndex (int digits, int n ){
         int beginNubmber = getBeginNumber(digits);
         int val = beginNubmber + n / digits;
         int indexFormRight = digits - n % digits;
         for (int i = 1; i < indexFormRight; ++i){
             val /=10;
         }
         return val%10;

     }

    //在上述函数中，我们需要知远m 位数的第一个数字。例如， 第一个两
    //位数是10 ， 第一个三位数是100 。第－个m 位数可以用如l下函数求得：
    private int getBeginNumber(int digits){
        return digits == 1
                ? 0
                : (int) Math.pow(10, digits -1);
    }

    public static void main(String[] args) {
        code_44_DigitAtIndex e = new code_44_DigitAtIndex();
        System.out.println(e.digitAtIndex(1001));
    }
}
