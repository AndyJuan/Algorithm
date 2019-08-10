class Dynamic_No1_lengthofLCS {
    public int lengthofLCS(int [] nums1, int[] nums2){
        int n1= nums1.length;
        int n2= nums2.length;
        int[][] dp=new int[n1+1][n2+1];
        for (int i = 1;i< n1;i++){
            for (int j = 1;j<n2;j++){
                if (nums1[i-1]==nums2[j-1]){
                    dp[i][j] = dp[i-1][j-1]+1;
                }else {
                    dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        return dp[n1][n2];
    }

    public static void main(String[] args) {
        int[][] dp=new int[3][3];
        for(int i=0;i<dp.length;i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
