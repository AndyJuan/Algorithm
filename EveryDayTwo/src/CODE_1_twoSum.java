import java.util.HashMap;
import java.util.Map;

public class CODE_1_twoSum {
    public static void main(String[] args) {

    }
    //遍历方法
    public int[] twoSum1(int[] nums, int target)
    {
        if (nums == null || nums.length == 0)
        {
            return null;
        }else{

            for (int i = 0; i<nums.length;i++)
            {
                for (int j = i+1;j<nums.length;j++){
                    if (target- nums[i] == nums[j])
                    {
                        return new int[]{i,j};
                    }
                }

            }

        }

        return null;

    }

    //哈希方法
    public int[] twoSum2(int[] nums, int target)
    {
        if (nums == null || nums.length == 0)
        {
            return null;
        }else{

            Map<Integer,Integer> hashtable = new HashMap<Integer, Integer>();
            for (int i=0; i < nums.length;i++)
            {
                if (hashtable.containsKey(target-nums[i]))
                {
                    return new int[]{i,hashtable.get(target-nums[i])};
                }
                hashtable.put(nums[i],i);
            }

        }

        return null;

    }
}
