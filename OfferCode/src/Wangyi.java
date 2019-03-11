import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Wangyi {
    public static int isPossible(String s1,String s2)
    {
        String[] snum=s1.split(" ");
        int a=Integer.valueOf(snum[0]);
        int b=Integer.valueOf(snum[1]);
        if(a>b)
        {
            return -1;
        }
        int hnum=1,hw=0;
        char[] schar=s2.toCharArray();
        for(int k=0;k<s2.length();k++)
        {
            if(hw==0&&(schar[k]=='.'||schar[k]==','||schar[k]=='?'||schar[k]=='!'))
            {
                return -1;
            }
            if(schar[k]!='\n')
            {

                if(hw+a<=b)
                {
                    hw=hw+a;
                }else
                {
                    if(schar[k]=='.'||schar[k]==','||schar[k]=='?'||schar[k]=='!')
                    {
                        return -1;
                    }
                    hnum++;
                    hw=a;
                }
            }else
            {
                hnum++;
                hw=0;
            }
        }
        return hnum;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=0;
        num=sc.nextInt();
        String[] ss=new String[2*num];
        int i=0;
        Scanner sc1=new Scanner(System.in);
        while(i<2*num&&sc1.hasNextLine())
        {
            ss[i]=sc1.nextLine();
            i++;
            System.out.println(Arrays.asList(ss)+" "+ss[i-1].length());
        }
        for(int j=0;j<2*num;)
        {
            int c=isPossible(ss[j],ss[j+1]);
            if(c>0)
                System.out.println(c);
            else
            {
                System.out.println("Impossible");
            }
            j+=2;
        }




    }

}
