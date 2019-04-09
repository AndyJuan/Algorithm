import java.util.Scanner;

public class A_Exam_Input_Output {
    //第一行为n，n为第二行字符串的长度
    //第二行为字符串
    //例
    //4
    //1110
    public static void form1(){
        Scanner in=new Scanner(System.in);
        String num=in.nextLine();
        String s=in.nextLine();
        int n=Integer.valueOf(num);

    }

    //输入一行字符串，trim()去掉字符串两端的多余的空格，中间的空格不会去掉
    public static void form2(){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();//输入一行字符串
       // str=str.trim();
        String[] c = str.trim().split(" ");
        System.out.println(str);
    }


    //第一行表示第二三行的个数 n
    //第二、三行表示整数
    //例：
    //3
    //8 5 10
    //1 1 2
    public static void form3(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] dp = new long[n];
        long[] coin = new long[n];
        for (int i =0; i < n; i++){
            dp[i] = sc.nextInt();
        }
        for (int i=0; i< n; i++){
            coin[i] = sc.nextInt();
        }
    }
    public static void form3_1(){
        Scanner in=new Scanner(System.in);
        String s1=in.nextLine();
        String s2=in.nextLine();
        String s3=in.nextLine();
        int n=Integer.valueOf(s1);
        String[] ss2=s2.split(" ");
        String[] ss3=s3.split(" ");
        long[]  sss2=new long[n];
        long[]  sss3=new long[n];
        for(int i=0;i<n;i++)
        {
            sss2[i]=Integer.valueOf(ss2[i]);
            sss3[i]=Integer.valueOf(ss3[i]);
        }
    }

    public static void form4(){
        //第一行输入{31, 18, 19, 1, 25}
        //第二行输入10
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String str2 = input.nextLine();
        str = str.substring(1, str.length() - 1);
        String[] c = str.split(", ");
        int[] num = new int[c.length];
        for (int i = 0; i < c.length ; i++) {
            num[i] = Integer.valueOf(c[i]);
            System.out.println(num[i]);

        }
    }
    //多行输入，第一行代表行数，下面每行代表一个问题
    //例：
    //3
    //10
    //81
    //0
    public static void form5(){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int num = sc.nextInt();
           // System.out.println(numberOfButtle(num)+"");此处调用写的函数，读取一个数，就输出该问题的解。
        }
    }



    public static void main(String[] args) {
        form2();
    }


}
