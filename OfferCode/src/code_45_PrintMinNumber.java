import java.util.Arrays;

/**
 * 题目描述
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 *
 * 例如输入数组 [3, 32, 321]，则打印出这3个数字能排成的最小数字321323。
 */

public class code_45_PrintMinNumber {
    public String printMinNumber(int[] nums){
        if (nums == null || nums.length == 0){
            return "";
        }
        int n = nums.length;
        String[] strNums = new String[n];
        for (int i =0; i < n; ++i){
            strNums[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strNums, (o1, o2) -> (o1 + o2).compareTo(o2 + o1));
        StringBuilder sb = new StringBuilder();
        for (String str : strNums){
            sb.append(str);
        }
        return sb.toString();
    }
}
