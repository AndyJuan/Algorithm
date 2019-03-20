public class code_46_StringTODigital {
    public static int numDecodings(String s){
        if (s == null || s.length() == 0)
            return 0;
        int n = s.length();
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = s.charAt(0) == '0' ? 0 :1;
        for (int i = 2; i <= n ; i ++ ){
            int one = Integer.valueOf(s.substring(i-1, i));
            int two = Integer.valueOf(s.substring(i-2,i));
            if (one>=1 && one <= 9)
                dp[i] += dp[i-1];
            if (two >=10 && two <=26)
                dp[i] += dp[i-2];
        }
        return dp[n];

    }

    public static void main(String[] args) {
        String s = "12";
        int n = s.length();
        System.out.println(n);
        System.out.println(s.substring(2-2,2));
        System.out.println(numDecodings(s));
    }
}