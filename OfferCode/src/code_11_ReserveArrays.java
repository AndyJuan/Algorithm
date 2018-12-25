/**面试题11 旋转数组的最小值
        描述：把数组开头的一部分移动到数组的末尾得到的数组称为旋转数组。输入一个递增排序的数组的旋转数组，输出数组的最小值。
        思路：考虑旋转数组的特点，使用二分查找方法逐渐缩小目标值的范围。需要考虑的特殊情况有：数组仅有一个元素的情形；数组未旋转的情形；形如｛1，0，1，1，1｝的数组需要顺序查找，因为二分查找会跳过最小值。
        考点：对于新概念的理解；对二分查找的熟练掌握；对不同输入的分析和全面考虑。
*/


public class code_11_ReserveArrays {
    public static int findMin(int[] arr){
        if (arr == null && arr.length == 0 ){
            throw new RuntimeException("Array is empty");
        }

        int start = 0;
        int end = arr.length -1;
        int midIndex = start;

        while (arr[start] >= arr[end]){
            if (end - start == 1){
                midIndex = end;
                break;
            }
            midIndex= (start + end )/2;

            if (arr[start] == arr[midIndex] && arr[midIndex] == arr[end]){
                return minInOrder(arr,start,end);
            }
            if (arr[start] <= arr[midIndex]){
                start = midIndex;
            }else if (arr[midIndex] <= arr[end]){
                end = midIndex;
            }
        }
        return  arr[midIndex];
    }

    private  static  int minInOrder(int[] arr, int start, int end){
        int result = arr[start];
        for (int i = start ; i<= end ; i ++){
            if (arr[i] < result){
                result = arr[i];
            }
        }
        return  result;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 1, 2, 3 };
        int[] arr2 = { 1, 0 , 1, 1, 1 };
        System.out.println(findMin(arr));
        System.out.println(findMin(arr2));
    }
}
