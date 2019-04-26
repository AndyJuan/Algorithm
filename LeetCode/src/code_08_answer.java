import java.util.Scanner;

public class code_08_answer {
    public static int myAtoi(String str) {
        char[] arr = str.toCharArray();
        int index = 0;
        int t = 0, sign = 1;
        boolean start = true;

        while (index < arr.length) {
            if (start) {
                if (arr[index] == ' ') {
                    index++;
                    continue;
                }
                // '+', '-' ASCII值为43,45
                if (arr[index] == 43 || arr[index] == 45) {
                    start = false;
                    sign = 44 - arr[index];
                    index++;
                    continue;
                }
            }
            //'0'-'9'的ASCII值
            if (arr[index] < 48 || arr[index] > 57) {
                return t * sign;
            }
            start = false;
            int r = t * 10 + (arr[index] - '0');
            //溢出时r会是另一个数
            if (r / 10 != t) {
                return sign == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            t = r;
            index++;
        }
        return t * sign;

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(myAtoi(s));
//        System.out.println(0x7FFFFFFF);
//        System.out.println(0x80000000);
    }
}
