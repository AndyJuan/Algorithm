import java.util.Arrays;

public class code_45_PrintMin {
    public String PrintMinNumber(int [] nums){
        if (nums == null || nums.length == 0) {
            return null;
        }
        int len = nums.length;
        String[] numbers = new String[len];
        for (int i = 0 ; i < nums.length ; i++){
            numbers[i] = nums[i] + "";
        }
        Arrays.sort(numbers,(s1,s2) -> (s1+s2).compareTo(s2+s1));
        String ret = "";
        for(String s : numbers){
            ret = ret + s;
        }
        return ret;
    }

    public static void main(String[] args) {
        code_45_PrintMin e = new code_45_PrintMin();
        int[] a = {31,2,34,51};
        System.out.println(e.PrintMinNumber(a));
    }
}
