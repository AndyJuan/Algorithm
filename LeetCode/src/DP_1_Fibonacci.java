import java.util.Arrays;

public class DP_1_Fibonacci {
    /* 斐波拉契数列
    1. 爬楼梯 70
    2. 强盗抢劫
    3. 强盗在环形街区抢劫
    4. 信件错排
    5. 母牛生产
    6. 矩形覆盖 剑指offer
    7. 青蛙跳台阶（变态跳台阶） 剑指offer
     */
    //1. 爬楼梯 70
    public static  int climbStairs(int n){
        if (n < 2){
            return n;
        }
        int pre2 = 1;
        int pre1 = 2;
        for (int i = 2; i <n; i++){
            int cur = pre1+pre2;
            pre2=pre1;
            pre1=cur;
        }
        return pre1;
    }

    //2. 强盗抢劫
    public static int rob1(int[] nums){
        //不可以抢劫邻近的住户   dp[i]=Math.max(dp[i-2]+num[i],dp[i-1])
        int pre2=0;
        int pre1=0;
        //int[] dp = new int[num.length];
        for (int i= 0; i < nums.length; i++){
            int cur =Math.max(pre2+nums[i],pre1);
            pre2=pre1;
            pre1=cur;
        }
        return pre1;
    }

    //3. 强盗在环形街区抢劫
    public static  int rob2(int[] nums){
        if (nums == null || nums.length==0){
            return 0;
        }
        int n = nums.length;
        if (n==1){
            return nums[0];
        }
        return Math.max(rob2(nums,0,n-2),rob2(nums,1,n-1));
    }
    public static  int rob2(int[] nums,int first,int last){
        int pre2=0;
        int pre1=0;
        //int[] dp = new int[num.length];
        for (int i= first; i <= last; i++){
            int cur =Math.max(pre2+nums[i],pre1);
            pre2=pre1;
            pre1=cur;
        }
        return pre1;

    }

    //4. 信件错排
    public static int wrongLetter(int n){
        if (n<2){
            return 0;
        }
        int pre1 = 1;
        int pre2=  0;
        for (int i=3;i<=n;i++){
            int cur=(i-1)*(pre1+pre2);
            pre2=pre1;
            pre1=cur;
        }
        return pre1;

    }
    public static int erroNum(int n){
        if(n==0)
            return 0;
        if(n==1)
            return 0;
        int []dp=new int [n+1];
        dp[0]=0;
        dp[1]=0;
        dp[2]=1;
        for(int i=3;i<=n;i++){
            dp[i]=(i-1)*(dp[i-1]+dp[i-2]);
        }
        return dp[n];
    }

    //5. 母牛生产  dp[i]=dp[i-1]+dp[i-3])

    //6. 矩形覆盖 青蛙跳台阶 剑指offer
    public static int RectCover(int n) {
        if (n <= 2)
            return n;
        int pre2 = 1, pre1 = 2;
        int result = 0;
        for (int i = 3; i <= n; i++) {
            result = pre2 + pre1;
            pre2 = pre1;
            pre1 = result;
        }
        return result;
    }

    //7. 青蛙变态跳台阶 剑指offer f(n) = 2*f(n-1)
    public int JumpFloorII(int target) {
        int[] dp = new int[target];
        Arrays.fill(dp, 1);
        for (int i = 1; i < target; i++)
            for (int j = 0; j < i; j++)
                dp[i] += dp[j];
        return dp[target - 1];
    }


    public static void main(String[] args) {
        System.out.println(erroNum(10));
        System.out.println(wrongLetter(10));
    }
}
