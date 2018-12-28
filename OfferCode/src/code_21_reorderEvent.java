import java.util.Arrays;

/**
 *
 * 描述：操作输入的整数数组，实现所有奇数位于数组的前部分，偶数位于数组的后部分。
 * 思路：比较容易想到使用两个变量分别指向数组的首段、尾端，向中间聚拢，完成数组顺序调整。
 * 考点：对数组的操作；对程序扩展性的考虑。 * 考虑可扩展性的解法，秒杀Offer
 */


public class code_21_reorderEvent {
    public static void reorderOddEven(int[] arr){
        if (arr == null || arr.length == 0 ){
            return;
       }
        int len = arr.length-1;
        int low =0;
        int high = len;

        while (low <= high){
            while (low <= len && !isEvent(arr[low])){//细节啊，不是arr{len]
                low++;
            }
            while (high >= 0  && isEvent(arr[high])){
                high--;
            }
            if (low <= high){
              int temp = arr[low];
               arr[low] = arr[high];
                arr[high] = temp;
            }

       }

    }
    //判断为偶数true， 奇数为false
    public static boolean isEvent(int num){
       return (num & 1) ==0;
   }



    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(array));
        reorderOddEven(array);
        System.out.println(Arrays.toString(array));
    }

}

