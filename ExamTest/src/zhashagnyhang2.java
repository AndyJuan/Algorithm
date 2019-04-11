
import java.io.*;
import java.util.*;
import java.math.*;

public class zhashagnyhang2 {

    public static void main(String[] args) {
        Scanner in = new Scanner( System.in );
        String str1 =in.nextLine();
        String str2 =in.nextLine();
        String[] word1=str1.split(" ");
        String[] word2=str2.split(" ");
        int[] sss=new int[word2.length];
        int[] ccc=new int[word1.length];
        for (int i=0;i<sss.length;i++) {
            sss[i]=Integer.valueOf(word2[i]);
        }
        for (int i=0;i<ccc.length;i++) {
            ccc[i]=Integer.valueOf(word1[i]);
        }
        Arrays.sort(sss);
        int num=ccc[0];
        int strr=num*sss[num]/2+num*sss[num];
        int res=num*sss[0]+num*2*sss[0];
        if (res>ccc[1]||2*sss[0]>sss[num]) {
            System.out.print(strr);
        }else {
            System.out.print(res);
        }
    }
}