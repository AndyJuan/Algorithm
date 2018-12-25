/**
 * 题目
 * 请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。路径可以从矩阵中的任意一个格子开始，每一步可以在矩阵中向左，向右，向上，向下移动一个格子。如果一条路径经过了矩阵中的某一个格子，则之后不能再次进入这个格子。 例如下面的3*4矩阵中包含一条字符串“bfce”的路径，但是矩阵中不包含"abfb"路径，因为字符串的第一个字符b占据了矩阵中的第一行第二个格子之后，路径不能再次进入该格子。
 * a	b	t	g
 * c	f	c	s
 * j	d	e	h
 *
 * 思路
 * 这是一个典型的回溯法应用实例,以题目中的例子为例：
 *
 * 首先在矩阵中任意选择一个字符ch1作为起点，然后和待查找的字符串中的第i个字符进行比较
 * 如果不相等，则继续遍历矩阵中ch1紧挨着的下一个元素
 * 如果相等，则对ch1周围的其他方向进行查找和待查找的字符串中地i+1个字符相等的字符
 * 重复上述过程直到待查找的字符串的每一个字符都在矩阵中找到，如果在矩阵中找到了待查找的字符串的前n个字符的位置后，在第n个字符的位置周围无法找到待查找字符串的第n+1个字符，则需要回退到第n-1个字符的位置上重新选择方向进行查找。
 * 注意
 * 除了矩阵边界的格子外，其他格子都有4个相邻的格子分别代表着相应的方向
 * 在该算法中须有一个标志数组，用来标志已经走过的路
 * 标志数组中标记走过的格子不能再访问
 * ---------------------
 * 作者：慕柏
 * 来源：CSDN
 * 原文：https://blog.csdn.net/qq_37447414/article/details/85108455
 * 版权声明：本文为博主原创文章，转载请附上博文链接！
 */

public class code_12_huiSuFa {
    public static boolean hasPath (char[] matrix, int rows , int cols, char[] str){
        if (matrix == null || rows < 1 || cols <1 || str == null){
            return  false;
        }

        //visted是一个标志数组用来标志哪些格子已经被访问过
        boolean[] visited = new  boolean[rows*cols];
        //初始化标志数组
        for (int i = 0 ; i< visited.length; i++){
            visited[i] = false;
        }
        //用来表示待查找字符串在矩阵中已经找到的字符个数
        Integer pathLength = 0;
//双重循环用来遍历矩阵寻找待查找字符串的第一个字符 row表示矩阵的当前行数
        //col表示矩阵当前的列数
        for (int row = 0; row <= rows; row++){
            for (int col = 0 ; col <= cols; col ++){
               //递归查找待查找的字符串在矩阵中是否存在
                if(hasPathCore(matrix,rows,cols,row,col,str,pathLength,visited))
                {
                    return true;
                }
            }
        }
      return  false;
    }
    private static boolean hasPathCore(char[] matrix,int rows,int cols,int row,int col,char[] str,Integer pathLength,boolean[] visited)
    {
        //如果待查找的字符串的所有字符都在矩阵中找到
        if(pathLength==str.length)
        {
            return true;
        }
        //用来表示在在矩阵中的某一个格子附近是否还能找到待查找字符串的下一个字符
        boolean hasPath=false;
        //如果矩阵当前格子的位置的字符等于待查找字符串的下一个字符
        if(row>=0&&row<rows&&col>=0&&col<cols&&matrix[row*cols+col]==str[pathLength]&&!visited[row*cols+col])
        {

            ++pathLength;

            visited[row*cols+col]=true;
            //继续在该位置的其他方向进行寻找下一个字符
            //左
            hasPath=hasPathCore(matrix,rows,cols,row,col-1,str,pathLength,visited)
                    //上
                    ||hasPathCore(matrix,rows,cols,row-1,col,str,pathLength,visited)
                    //右
                    ||hasPathCore(matrix,rows,cols,row,col+1,str,pathLength,visited)
                    //下
                    ||hasPathCore(matrix,rows,cols,row+1,col,str,pathLength,visited);
            //如果在某个位置上找不到待查找字符串的下一个字符
            if(!hasPath)
            {
                //回退到上一个位置
                --pathLength;
                visited[row*cols+col]=false;
            }
        }
        return hasPath;
    }

    public static void main(String[] args) {
        char[] matrix = {  'a', 'b', 't', 'g' , 'c', 'f', 'c', 's' , 'j', 'd', 'e', 'h' };
        char[]  str ={'b','f','c'} ;

        System.out.println(hasPath(matrix, 3,4,str));
    }

}
