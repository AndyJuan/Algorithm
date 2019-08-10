import java.util.ArrayList;
//分析问题不透彻，首先应该仔细分析该题的特点
public class code_66_plusOne {
    public static int[] plusOne(int[] digits) {
        //测试案例中没有空没有测试例
       for (int i = digits.length-1; i >=0; i--){
           digits[i]++;
           digits[i]=digits[i]%10;
           if (digits[i] !=0 ){
               return digits;
           }
       }
       digits = new int[digits.length+1];
       digits[0] = 1;
       return digits;

    }

    public static void main(String[] args) {
        int[] nums = {9,8,7,6,5,4,3,2,1,0};

        nums = plusOne(nums);
        for(int num : nums){
            System.out.println(num);
        }

    }

}
