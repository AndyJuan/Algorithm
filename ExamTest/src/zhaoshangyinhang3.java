
import java.io.*;
import java.util.*;
import java.math.*;

public class zhaoshangyinhang3 {

    public static void main(String[] args) {
        Scanner in = new Scanner( System.in );
        String str1 =in.nextLine();
        String str2 =in.nextLine();
        int n=Integer.parseInt(str1);
        String[] numString=str2.split(" ");
        int[] numArr=new int[numString.length];
        for (int i=0;i<numArr.length;i++) {
            numArr[i]=Integer.parseInt(numString[i]);
        }
        int maxn=100000+1000;
        int[] b=new int[maxn];
        int[] c=new int[maxn];
        int maxc=0;
        for(int i=0;i<n;i++){
            if(numArr[i]>maxc) {
                maxc=numArr[i];
            }
            int cur=0;
            b[numArr[i]]++;
            while(numArr[i]>=1) {
                cur++;
                numArr[i]=numArr[i]/2;
                b[numArr[i]]++;
                c[numArr[i]]+=cur;
            }
        }
        int ans=c[1];
        for(int i=2;i<=maxc;i++)
        {
            if(b[i]==n)
            {
                ans=Math.min(ans,c[i]);
            }
            else if(i%2==0&&b[i/2]==n)
            {
                c[i]=c[i/2]-b[i]+n-b[i];
                b[i]=n;
                ans=Math.min(ans,c[i]);
            }
        }
        System.out.print(ans);
    }
}