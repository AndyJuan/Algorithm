import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class code1_TwoSum {
    public static int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i <nums.length;i++){
            int contain = target - nums[i];
            if (map.containsKey(contain)){
                return new int[] {map.get(contain),i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");

    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int[] ret = new int[2];
        ret = twoSum(nums,9);
        for (int i : ret)
            System.out.println(i);

    }
}
