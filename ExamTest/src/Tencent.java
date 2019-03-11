import java.util.Scanner;

public class Tencent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int n = Integer.parseInt(s);
        for (int i = 0; i < n; i++) {
            String s1 = scanner.nextLine();
            String[] numstr = s1.split(" ");
            int a = Integer.parseInt(numstr[0]);
            int b = Integer.parseInt(numstr[1]);
            int sum = 0;
            if (a % 2 == 1) {
                if ((b - a) % 2 == 1) {
                    sum = (b - a + 1) / 2;
                } else {
                    sum = (b - a) / 2 - b;
                }
            } else {
                if ((b - a) % 2 == 1) {
                    sum = -(b - a + 1) / 2;
                } else {
                    sum = -(b - a) / 2 + b;
                }
            }
            System.out.println(sum);
        }
    }
}
