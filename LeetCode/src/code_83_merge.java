public class code_83_merge {
    //从尾部开始合并，每次找出最大的，这样一遍扫描即可完成
    public static void merge(int[] nums1, int m, int[] nums2,int n)
    {
        int k = m+n -1;
        int i =m-1,j = n-1;
        while (k>=0){
            if (j<0){
                nums1[k--]=nums1[i--];
                continue;

            }
            if (i< 0)
            {
                nums1[k--] = nums2[j--];
                continue;

            }
            if (nums1[i] > nums2[j])
            {
                nums1[k--] =nums1[i--];

            }else{
                nums1[k--] = nums2[j--];

            }

        }
    }

    public static void main(String[] args) {
        int[] nums1 = {0};
        int[] nums2 = {1};
        merge(nums1,0,nums2,1);
        System.out.println(nums1[0]);
    }
}
