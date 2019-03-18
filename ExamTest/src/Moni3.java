import java.util.Arrays;
import java.util.Scanner;

public class Moni3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] a=new int[n];
        int [] b=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            b[i]=sc.nextInt();
        }
        int suma=0,sumb=0;
        Arrays.sort(a);
        Arrays.sort(b);
        int i=n-1,j=n-1;
        boolean f=true;
        while(i>=0||j>=0)
        {
            if(i>=0)
            {
                if(j>=0)
                {
                    if(a[i]>=b[j])
                    {
                        suma+=a[i];
                        i--;
                    }else
                    {
                        j--;
                    }
                }else
                {
                    suma+=a[i];
                    i--;
                }
            }else
            {
                if(j>=0)
                {
                    j--;
                }
            }
            if(j>=0)
            {
                if(i>=0)
                {
                    if(b[j]>=a[i])
                    {
                        sumb+=b[j];
                        j--;
                    }else
                    {
                        i--;
                    }
                }else
                {
                    sumb+=b[j];
                    j--;
                }
            }else
            {
                if(i>=0)
                {
                    i--;
                }
            }

        }
        System.out.println(suma-sumb);
    }
}
