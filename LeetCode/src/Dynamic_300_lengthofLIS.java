public class Dynamic_300_lengthofLIS {
    //最长上升子序列
    public int lengthofLIS(int[] nums){
        int n = nums.length;
        int[] tail= new int[n];
        int len =0;
        for (int num :nums){
            int index = binarySearch(tail,len,num);
            tail[index]=num;
            if (index==len){
                len++;
            }
        }
        return len;
    }
    public static int binarySearch(int[] tails,int len,int num){
        int l =0, h=len;
        while (l<h){
            int mid = l+(h-l)/2;
            if (tails[mid] == num){
                return mid;
            }else if (tails[mid] < num){
                l=mid+1;
            }else {
                h=mid;
            }
        }
        return l;
    }

}
