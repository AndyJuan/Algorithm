import java.io.*;
import java.util.*;
import java.math.*;

public class Main
{
    public static int shot (int n, int m, int[] array){
        if (n == 0 || array.length == 0 || array == null || n<m)
            return -1;
        int sum =0;
        int cnt =0;
        int[] bit = new int[m+1];
        Arrays.fill(bit,0);
        for(int i = 0; i < array.length ;i++){
            if (array[i] != 0 ){

                if (bit[array[i]] == 0 ){
                    bit[array[i]] = 1;
                    sum += array[i];
                    if (sum == (int) (m*(m +1)/2) ){
                        break;
                    }
                }
                ++cnt ;
               // System.out.println("cnt为：" + cnt+"sum为"+sum+"array{}"+ array[i]);
            }else {
                sum =0;
                cnt =0;
            }
        }
        return cnt;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        // 从键盘接收数据

        // nextLine方式接收字符串
        System.out.println("nextLine方式接收：");
        // 判断是否还有输入
        String ss = scan.nextLine();
        String[] ss1 = ss.split(" ");
        int n = Integer.valueOf(ss1[0]);
        int m = Integer.valueOf(ss1[1]);


        String s = null;
        s = scan.nextLine();
        String[] array = s.split(" ");
        int[] num = new int[n];

        for (int i = 0 ; i < array.length ;i++ ){
            num[i] = Integer.parseInt(array[i]);
        }

          //  System.out.println("输入的字符为：" + array[i-1]);

//        int n =12;
//        int m =5;
//        int[] array ={2,5,3,1,3,2,4,1,0,5,4,3};

        System.out.println(shot(n,m,num));
    }
}
