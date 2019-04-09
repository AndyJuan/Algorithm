import java.util.Arrays;
import java.util.Scanner;

public class Pduoduo2_2 {
    public static void main(String[] args) {
        //第一行输入{31, 18, 19, 1, 25}
        //第二行输入10
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String str2 = input.nextLine();
        str = str.substring(1, str.length() - 1);
        String[] c = str.split(", ");
        int[] num = new int[c.length];
        for (int i = 0; i < c.length ; i++) {
            num[i] = Integer.valueOf(c[i]);
            System.out.println(num[i]);
        }
        int d = Integer.valueOf(str2);
        int n = num.length;
        Arrays.sort(num);
        int count = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((num[j] - num[i]) <= d) {
                    count++;
                }
            }
        }
        System.out.println(count);
        double total = n * (n-1)/2;
        double result = 1.0*count/total;
        System.out.println(String.format("%.6f",result));

    }
}
