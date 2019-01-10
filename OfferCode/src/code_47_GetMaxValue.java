/**
 * 题目描述
 * 在一个 m×n 的棋盘的每一格都放有一个礼物，每个礼物都有一定的价值（价值大于 0）。
 *
 * 你可以从棋盘的左上角开始拿格子里的礼物，并每次向左或者向下移动一格直到到达棋盘的右下角。
 *
 * 给定一个棋盘及其上面的礼物，请计算你最多能拿到多少价值的礼物？
 *
 * 解法
 * 写出递推式，res 表示获得的最大礼物。
 *用一个长度与列相等的一位数组保存值；
 * res[i][j] = Math.max(res[i - 1][j], res[i][j - 1]) + grid[i][j];
 */

public class code_47_GetMaxValue {
    public static int getMaxValue(int[][] grid){
        if (grid == null || grid.length == 0){
            return 0;
        }
        int m = grid.length;//行数
        int n = grid[0].length;//列数
        int[] res = new int[n];
        for (int i = 0; i < m ; ++i){
            for (int j = 0; j < n; ++j){
                int left = 0;
                int up = 0;
                if (i > 0){
                    up = res[j];
                }
                if (j > 0){
                    left = res[j-1];
                }
                res[j] = Math.max(up,left)+ grid[i][j];
            }
        }
        return res[n-1];
    }
    public static void main(String[] args)
    {
        int[][] values = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        System.out.println(getMaxValue(values));  //29
        int[][] values1 = {{1, 10, 3, 8}};
        System.out.println(getMaxValue(values1));  //22
        int[][] values2 = {
                {1},
                {1},
                {5},
                {3}};
        System.out.println(getMaxValue(values2));  //10
    }

}
