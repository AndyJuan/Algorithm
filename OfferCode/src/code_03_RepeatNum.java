// page 39 数组中重复的数字
// 题目1
// 输出数组中重复的数字，空间复杂度O(1)，时间复杂度O(n)
// 数组长度为n，数字在0~n-1范围内

import java.util.Arrays;

public class code_03_RepeatNum {
    public static int  duplicate1 (int[] arr){
        if (arr == null || arr.length==0)
            return -1;
        for (int i = 0; i< arr.length; i++){
            while(arr[i]!=i){
                if (arr[i]==arr[arr[i]]){
                    return arr[i];
                }else {
                    int m = arr[i];
                    arr[i]= arr[m];
                    arr[m]=m;
                    //  System.out.println(Arrays.toString(arr));
                }
            }
        }
        return -1;
    }

//     题目2
//     * 在一个长度为n+l 的数组里的所有数字都在1～n 的范围内，所以数组
//     * 中至少有一个数字是重复的。请找出数组中任意一个重复的数字，但不能
//     *修改输入的数组。例如，如果输入长度为8 的数组｛2, 3, 5, 4, 3, 2, 6, 7｝，那
//     *么对应的输出是重复的数字2 或者3.
//
//     * 输出数组中重复的数字，空间复杂度O(1)，时间复杂度O(nlog(n))
//         数组长度为n+1，数字在1~n范围内，要求不修改数组，并不使用辅助空间

    public static int duplicate2(int[] arr){
        if (arr == null || arr.length==0)
            return -1;

        int start = 1;
        int end = arr.length-1;
        while (end >= start){
            int middle = (end - start )/2 + start;
            int count = getCounter(arr,start,middle);

            if (end == start) {
                if (count > 1) {
                    return start;
                }else {
                    break;
                }
            }

            if (count > middle - start + 1) {
                end = middle;
            }
            else
                start = middle+1;
        }
        return -1;
    }
    // 计算数组arr元素处在[start, end]范围内元素个数
    private static int getCounter(int[] arr, int start, int end){
        int count =0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] >= start && arr[i] <= end) count ++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        System.out.println("arr 的重复数字： "+duplicate1(arr));
//        System.out.println("ww");
        int[] arr2 = {2, 3, 5, 4, 3, 2, 6, 7};
        System.out.println("arr2 的重复数字： "+duplicate2(arr2));

        System.out.println(duplicate1(null));
        System.out.println(duplicate2(null));
    }
}
