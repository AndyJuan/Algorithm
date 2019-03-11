import java.util.ArrayList;

public class code_57_1_SUM {
    public static ArrayList<Integer> FindNumbersWithSum(int [] array, int sum){
        ArrayList<Integer> ret = new ArrayList<>();
        if (array == null || array.length ==0){
            return ret;
        }
        int lo = 0;
        int hi = array.length-1;

        while (lo < hi) {
            if ((array[lo] + array[hi]) > sum){
                hi--;
            }else if((array[lo] + array[hi]) < sum){
                lo++;
            }else {
                ret.add(array[lo]);
                ret.add(array[hi]);
                return  ret;
            }
        }
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,9,11,15};
        FindNumbersWithSum(array,12);
        System.out.println(FindNumbersWithSum(array,12));
        int[] array2={};
        System.out.println(FindNumbersWithSum(array2,0));
    }
}
