import java.util.Scanner;

public class Zhaoshangyinhang1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long count = 0;

        if(n < 6){
            count = 0 ;
        }else {
            int[] dp = new int[1+n];
            dp[0] = 1;
            dp[1] = 1;
            dp[2] = 2;
            for (int i =3; i <= n-6 ;i++){
                dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
            }
            int cnt = n+1;

            while (--cnt>=6){
                count+=dp[n-cnt];
            }
        }
        count = count%666666666;
        System.out.println(count);
    }
}
