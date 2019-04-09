import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        //{31, 18, 19, 1, 25}输入第一行
        //10输入第二行
        Scanner sc=new Scanner(System.in);
        String s2=sc.nextLine();
        String s=s2.substring(1,s2.length()-1);
        String s1=sc.nextLine();
        //数组
        int d=Integer.valueOf(s1);
        String[] ss=s.split(", ");
        int [] color=new int[ss.length];
        for(int i=0;i<ss.length;i++)
        {
            color[i]=Integer.valueOf(ss[i]);
        }
        Arrays.sort(color);
        int res=0;
        for(int i=0;i<ss.length-1;i++)
        {
            int j=i+1;
            while(j<ss.length&&color[j]-color[i]<=d)
            {
                res++;
                j++;
            }

        }
        System.out.println("count = "+res);
        int sum=ss.length*(ss.length-1)/2;
        double pp=1.0*res/(sum);
        System.out.println(String.format("%.6f",pp));

    }

}
