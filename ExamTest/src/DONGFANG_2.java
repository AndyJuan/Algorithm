import java.util.Scanner;

public class DONGFANG_2 {
    public static void main(String[] args) {
        //股票最多进行两次买入卖出
        // https://www.cnblogs.com/ranranblog/p/5845010.html
        // 输入第一行为数组个数，第二行为数组元素
        //6
        //2 5 3 9 15 2
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n];
        for (int i =0; i < n; i++){
            dp[i] = sc.nextInt();
        }
       // System.out.println(maxProfit(dp,dp.length));
        System.out.println(calculateMax(dp));

    }
    public static int maxProfit(int[] prices, int length){
        int maxValue =0;
        int[][] dp = new int[length][length];
        for (int i = 0; i < length-1;i++){
            for (int j = i+1;j<length;j++){
                dp[i][j] = prices[j] - prices[i];
            }
        }

        int value =0;
        int value2=0;
        int start =0;
        int end =0;
        for (int i = 0; i< length;i++){
            for (int j = i+1;j<length;j++){
                if (dp[i][j]>value){
                    value=dp[i][j];
                    start=i;
                    end=j;
                }
            }
        }
        System.out.println("start："+start+"end："+end+"value："+value);
       //value陷入局部最优，这种做法不正确

        for (int i = 0; i< start;i++){
            for (int j = i+1;j<start;j++){
                if (dp[i][j]>value2){
                    value2=dp[i][j];
                }
            }
        }
        System.out.println("value2："+value);
        if (end < length-1){
            for (int i = end+1;i<length;i++){
                for (int j = i+1; j<length;j++){
                    if (dp[i][j]>value2 ){
                        value2=dp[i][j];
                    }
                }
            }
        }

        maxValue=value+value2;
        return maxValue;
    }

    public static int calculateMax(int[] prices){
        int n = prices.length;
        if (n<1){
            return 0;
        }
        int[] left=new int[n];
        int[] right = new int[n];
        int min = prices[0];
        for (int i =1; i< n ;i++){
            if (min>prices[i]){
                min=prices[i];
            }
            left[i]=Math.max(prices[i]-min,left[i-1]);
        }

        int high = prices[n-1];
        for (int i = n-2;i >0;i--){
            if (high<prices[i]){
                high=prices[i];
            }
            right[i] = Math.max(high-prices[i],right[i-1]);
        }
        int result =0 ;
        for (int i =0;i<n;i++){
            if (right[i]+left[i]>result)
                result=right[i]+left[i];
        }
        return result;

    }
}
