import java.util.Scanner;

public class Huawei_02_Qishuiping {
    public static int numberOfButtle (int num){
        if (num < 1)
            return 0;
        int count = 0;
        int ret = 0;
        while (num != 1 ){
            count +=  (int)num/3;
            num = (int)num/3 + num%3;
            if (num == 2){
                count++;
                break;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[11];
        int count =0;
        for (int i = 0; i < 11; i++){
            nums[i] = sc.nextInt();
            if (nums[i] == 0){
                count = i;
                break;
            }
        }


        for (int j=0;j<count;j++){
            System.out.println(numberOfButtle(nums[j])+"");
        }

    }
}
