
//数组最小路径和
public class Code_07_MinPath {

    //暴力枚举解法： 从（i,j）出发，到达最小右下角位置，最小路径和
    public static int walk (int[][] matrix, int i, int j){
        if(i==matrix.length-1 && i==matrix[0].length-1){ //如果已经到达最右下角的位置
            return matrix[i][j];//右下角的值
        }

        //如果已经到达最后一行了，则只能往右边走，
        if (i == matrix.length-1){
            return matrix[i][j] +walk(matrix,i,j+1);
        }
        //如果已经到达最后一列了，则只能往下走，下边位置加下边所有位置的和为所有代价和
        if (j == matrix.length-1){
            return matrix[i][j] +walk(matrix,i+1,j);
        }

        int right = walk(matrix,i,j+1);//right -> 右边位置到右下角的最短路径和
        int down = walk(matrix, i+1,j);//down -> 下边位置到右下角的最短路径和
        return matrix[i][j]+Math.min(right,down);
    }

    public static void main(String[] args) {

    }
}
