import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ScannerDemo {

        public static void main(String[] args) {
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
class InputReader
{
    BufferedReader buf;
    StringTokenizer tok;
    InputReader()
    {
        buf = new BufferedReader(new InputStreamReader(System.in));
    }
    boolean hasNext()
    {
        while(tok == null || !tok.hasMoreElements())
        {
            try
            {
                tok = new StringTokenizer(buf.readLine());
            }
            catch(Exception e)
            {
                return false;
            }
        }
        return true;
    }
    String next()
    {
        if(hasNext()) return tok.nextToken();
        return null;
    }
    int nextInt()
    {
        return Integer.parseInt(next());
    }
    long nextLong()
    {
        return Long.parseLong(next());
    }
    double nextDouble()
    {
        return Double.parseDouble(next());
    }
    BigInteger nextBigInteger()
    {
        return new BigInteger(next());
    }
    BigDecimal nextBigDecimal()
    {
        return new BigDecimal(next());
    }
}
