public class Dynamic_376_wiggleMaxLength {
    //最长摆动动序列,时间复杂度为O(N)
    public int wiggleMaxLength(int[] nums) {
        if (nums == null || nums.length==0){
            return 0;
        }
        int up =1;
        int down =1;
        for(int i =1; i< nums.length;i++){
            if (nums[i]<nums[i-1]){
                down = up+1;
            }else if (nums[i]>nums[i-1]){
                up=down+1;
            }
        }
        return Math.max(up,down);

    }
}
