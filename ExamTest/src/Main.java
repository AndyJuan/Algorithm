import java.io.*;
import java.util.*;
import java.math.*;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        // 从键盘接收数据

        // nextLine方式接收字符串
        System.out.println("nextLine方式接收：");
        // 判断是否还有输入
        while (scan.hasNextLine()) {
            int int1 = scan.nextInt();
            String str2 = scan.next();
            System.out.println("输入的int为：" + int1);
            System.out.println("输入的字符为：" + str2);
        }
        scan.close();
    }
}
