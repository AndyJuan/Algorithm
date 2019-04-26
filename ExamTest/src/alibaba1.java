import java.util.Scanner;

public class alibaba1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        String str = str1.substring(1, str1.length() - 1);
        int k = Integer.valueOf(str2);
        String[] c = str.split(",");
        int[] num = new int[c.length];
        for (int i = 0; i < c.length ; i++) {
            num[i] = Integer.valueOf(c[i]);
            //  System.out.println(c[i]);
        }
    }
}
