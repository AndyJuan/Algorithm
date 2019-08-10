import java.util.Arrays;

public class Dynamic_646_findLongestChain {
    //最长对数链,使用贪心算法，动态规划算法需要O(N)的空间
    public int findLongestChain(int[][] pairs) {
        if (pairs == null || pairs.length == 0){
            return 0;
        }
        Arrays.sort(pairs,(a,b) -> (a[1]-b[1]));//要按第二个数进行排序
        int count = 1;
        int cur = pairs[0][1];
        int n = pairs.length;
        for (int i = 1; i< n;i++){
            if (pairs[i][0] > cur){
                count++;
                cur=pairs[i][1];
            }
        }
        return count;


    }
}
