import java.util.Scanner;

public class Toutiao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1024-sc.nextInt();
        int count =0;
        while (num > 0 ){
            if (num >= 64){
                count += num / 64;
                num = num %64;
            }
            if (num >= 16){
                count +=num /16;
                num = num % 16;
            }
            if (num >= 4){
                count += num / 4;
                num = num %4;
            }
            if (num >= 1){
                count +=num /1;
                num = num % 1;
            }

        }
        System.out.println(count);

    }
}
