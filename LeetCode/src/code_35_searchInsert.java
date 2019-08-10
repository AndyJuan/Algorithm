public class code_35_searchInsert {
    public static int searchInsert(int[] nums, int target) {
        int hig = nums.length-1;
        int low = 0;
        while (low < hig){
            int mid = (hig-low)/2+low;
            if (target <= nums[mid]){
                hig = mid;
            }else {
                low = mid+1;
            }
        }
        if (nums[hig] >=target){
            return  hig ;
        }else {
            return hig+1;
        }

    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target =0;
        System.out.println(searchInsert(nums,target));
    }
}
