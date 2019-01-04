import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 解法
 * 剑指offer上的思路有点复杂，需要考虑坐标变换太多，考虑用另一种思路来解决。
 *
 * 在矩阵中，使用左上角坐标(tR,tC)和右下角的坐标(dR,dC)就可以表示一个矩阵。比如题目中的矩阵，当(tR,tC) = (0,0)和(dR,dC) = (3,3)时，表示的子矩阵就是整个矩阵：
 *
 * 1	2	3	4
 * 5			8
 * 9			12
 * 13	14	15	16
 * 当外层循环遍历后，可以令tR和tC加1，dR和dC减1，执行内层循环。当左上角的坐标跑到右下角坐标的右方或者下方，则整个过程就终止。
 */

public class code_29_PrintMatrixClockwisely {
    public ArrayList<Integer> printMatrix(int[][] matrix){
        ArrayList<Integer> relist = new ArrayList<>();
        if (matrix == null){
            return relist;
        }
        int tr = 0;
        int tc = 0;
        int dr = matrix.length -1;
        int dc = matrix[0].length -1;

        while (tr <= dr && tc<= dc){
            printMatrix(matrix,tr++,tc++,dr--,dc--,relist);
        }
        return relist;
    }

    public void printMatrix (int [][] matrix, int tr, int tc,int dr, int dc, ArrayList<Integer> relist){
      //只有一行
        if (tr == dr){
            for(int i = tc ; i <=dc; i++){
                relist.add(matrix[tr][i]);
            }
        }
        //只有一列
        else if (tc == dc){
            for(int i = tr ; i <=dr; i++){
                relist.add(matrix[i][tc]);
            }
        }else{
            int curR = tr;
            int curC = tc;
            //从左到右
            while (curC != dc){
                relist.add(matrix[tr][curC]);
                curC++;
            }
            //从上到下
            while (curR != dr){
                relist.add(matrix[curR][dc]);
                curR++;
            }
            //从右到左
            while (curC != tc){
                relist.add(matrix[dr][curC]);
                curC--;
            }
            //从下到上
            while (curR != tr){
                relist.add(matrix[curR][tc]);
                curR--;
            }
        }
    }


}
