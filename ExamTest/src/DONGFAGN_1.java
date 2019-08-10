public class DONGFAGN_1 {
    public static Boolean isMixedString(String str1,String str2,String str3){
        if(str1==null||str2==null||str3==null){
            return false;
        }
        int len1=str1.length();
        int len2=str2.length();
        int len3=str3.length();
        if(len1+len2!=len3){
            return false;
        }

        boolean[][]dp=new boolean[len1+1][len2+1];

        dp[0][0]=true;
        for(int i=0;i<len1;i++){
            if(str1.charAt(i)==str3.charAt(i)){
                dp[i+1][0]=dp[i][0];
                System.out.println(i+"i"+dp[i+1][0]);
            }

        }
        for(int i=0;i<len2;i++){
            if(str2.charAt(i)==str3.charAt(i)){
                dp[0][i+1]=dp[0][i];
            }
        }

        for(int i=0;i<len1;i++){
            for(int j=0;j<len2;j++){
                dp[i+1][j+1]=(dp[i+1][j]&&(str2.charAt(j)==str3.charAt(i+j+1)))||(dp[i][j+1]&&(str1.charAt(i)==str3.charAt(i+j+1)));
            }
        }

        return dp[len1][len2];
    }

    public static void main(String[] args) {
        //判断s3是否为s1和s2的交叉组成，字符的相对顺序不变，例如s1=abc,s2=defg,则s3=adebfcg或adbecfg
        String s1="aabcc";
        String s2="dbbca";
        String s3="adabbcbcca";
        System.out.println(isMixedString(s1,s2,s3));
    }
}
