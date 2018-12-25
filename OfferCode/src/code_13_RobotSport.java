
/**
1.题目描述：

        地上有一个m行和n列的方格。一个机器人从坐标0,0的格子开始移动，
        每一次只能向左，右，上，下四个方向移动
        一格，但是不能进入行坐标和列坐标的数位之和大于k的格子。 例如，当k为18时，
        机器人能够进入方格（35,37），因为3+5+3+7 = 18。但是，它不能进入方格（35,38），
        因为3+5+3+8 = 19。请问该机器人能够达到多少个格子？
        2.代码实现：
 */


public class code_13_RobotSport {
    public static void main(String[] args) {

        System.out.println(movingCount(18,0,0));
        System.out.println(movingCount(18,1,8));
        System.out.println(movingCount(18,8,1));
        System.out.println(movingCount(18,1,1));
        int all = movingCount(18,40,40);
        System.out.println(all);
    }

    //计算横纵坐标的数位之和
    public static  int bitCount(int t){
        int count = 0;
        while(t!=0){
            count = count + t%10;
            t = t/10;
        }
        return count;
    }

    //机器人移动位置主方法
    public static int movingCount(int threshold,int rows,int cols){
        //声明一个布尔型的位置标记数组
        boolean [][] visited = new boolean[rows][cols];
        for(int i =0 ; i<= rows-1; i++) {
            for (int j = 0; j <= cols-1; j++) {
                visited[i][j] = false;
            }
        }
        return countingSteps(threshold,rows,cols,0,0,visited);
    }

    public static  int countingSteps(int threshold,int rows,int cols,int row,int col,boolean [][]visited){
        //当前范围是否合法 当前位置是否已访问 当前位置横纵坐标之和是否超出阈值
        if(row < 0 ||row >= rows || col < 0 || col >= cols || visited[row][col] || bitCount(row)+bitCount(col) > threshold)
            return 0;
        visited[row][col] = true;//将当前访问位置访问标志置为true
        //递归判断上下左右位置是否可达
        return countingSteps(threshold,rows,cols,row-1,col,visited) +
                countingSteps(threshold,rows,cols,row,col-1,visited) +
                countingSteps(threshold,rows,cols,row+1,col,visited) +
                countingSteps(threshold,rows,cols,row,col+1,visited) + 1;
    }
}
