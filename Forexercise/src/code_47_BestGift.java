public class code_47_BestGift {
    public int getMost(int[][] board){
        if (board == null || board.length == 0)
            return 0;
        int rows = board.length;
        int cols = board[0].length;
        int[] mostBonus = new int[cols];
        for (int i = 0; i<rows; i++)
            for (int j = 0; j < cols; j ++){
                int up = 0;
                int left = 0;
                if (i >0 ){
                    up = mostBonus[j];
                }
                if (j>0){
                    left=mostBonus[j-1];
                }
                mostBonus[j] = Math.max(up,left) + board[i][j];
            }
            return mostBonus[cols -1];
        }

}
