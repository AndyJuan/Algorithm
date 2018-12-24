
//思路： 从右上角或左下角开始找，逐行删除，或者用二分法查找

public class code_04_FindInArray {
    public boolean findArray(int[][] arr, int target){
        if (arr == null || arr.length == 0) {
            return  false;
        }


        int row = 0;
        int coloum = arr[0].length-1;

        while (row < arr.length && coloum >= 0) {
            // 从右上角的元素开始查找，逐渐缩小范围
            if (arr[row][coloum] == target) {
                return true;
            }
            if (arr[row][coloum] > target) {
                coloum--;
            }else {
                row++;
            }
        }
        return false;

    }

    public static void main(String[] args){
        int[][] data = {{1,2,8,9},
                {2,4,9,12},
                {4,7,10,13},
                {6,8,11,15}};
        code_04_FindInArray f= new code_04_FindInArray();
        System.out.println(f.findArray(data,5));
        System.out.println(f.findArray(data,10));
    }


}
