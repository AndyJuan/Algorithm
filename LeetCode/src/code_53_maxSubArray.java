public class code_53_maxSubArray {
    //动态递归： 主要是利用逐步求解，以连续数组结束位置为每一步的解，
    // sum其实就是记录了上一步骤的解，在这一步骤进行对比，如果上一步
    // 骤的解<0则舍弃。最终得到这一步骤解，与之前步骤解的最大值res进
    // 行比较，保存当前的最优解。
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max =nums[0];
        for (int i = 0;i < nums.length;i++){
            sum=sum > 0  ? sum + nums[i] : nums[i];
            if (max < sum){
                max = sum;
            }
        }
        return max;

    }
    //分治法： 通过递归分治不断的缩小规模，问题结果就有三种，左边的解，
    // 右边的解，以及中间的解（有位置要求，从中介mid向两边延伸寻求最优解），
    // 得到三个解通过比较大小，等到最优解。
    public int maxSubArray2(int[] nums) {
        return maxSubArrayPart(nums,0,nums.length-1);


    }
    public static int maxSubArrayPart(int[] nums, int left,int right){
        if (left == right){
            return nums[left];
        }
        int mid = (left + right )/2;
        return 0;
    }


}
