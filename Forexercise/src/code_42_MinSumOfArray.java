public class code_42_MinSumOfArray {
    public int FindGreatestSumOfSubArray(int[] array){
        if (array == null || array.length == 0) {
            return 0;
        }
        int sum = 0;//刚开始和是0 ，不是array[0]
        int greastSum = Integer.MIN_VALUE;
        for (int num : array){
            sum = sum < 0 ? num  : sum +num;
            greastSum = Math.max(greastSum,sum);
        }
        return greastSum;
    }
}
