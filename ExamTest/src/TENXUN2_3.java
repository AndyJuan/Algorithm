import java.util.Scanner;

public class TENXUN2_3 {
    public static long fight(long[] sss1,long[] sss2,int i,long p,long r)
    {
        if(i>=sss1.length)
            return r;

        if(p<sss1[i])
        {
            System.out.println("进入1");
            r+=sss2[i];
            return fight(sss1,sss2, i+1, p+sss1[i],r);
        }
        else
        {
            System.out.println("进入2");
            return Math.min(fight(sss1,sss2,i+1, p+sss1[i],r+sss2[i]),fight(sss1,sss2, i+1, p,r));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] dp = new long[n];
        long[] coin = new long[n];
        for (int i =0; i < n; i++){
            dp[i] = sc.nextInt();
        }
        for (int i=0; i< n; i++){
            coin[i] = sc.nextInt();
        }
        long res=fight(dp,coin,0,0,0);
        System.out.println(res);
//        long res = coin[0] + coin[1];
//        long dpTotal =  dp[0] + dp[1];
//        for (int i = 2 ; i < n;i++){
//            if (dp[i] >= dpTotal){
//                res+=coin[i];
//                dpTotal+=dp[i];
//            }
//        }
//        System.out.println(res);

    }
}
