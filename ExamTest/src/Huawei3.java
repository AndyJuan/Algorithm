import java.util.Scanner;

public class Huawei3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        String str = str1.substring(1, str1.length() - 1);
        int k = Integer.valueOf(str2);
        String[] sss = str.split(",");
        int[] word = new int[sss.length];
        for (int i = 0; i < sss.length ; i++) {
            word[i] = Integer.valueOf(sss[i]);
            System.out.println(sss[i]);
        }
    }
}
