import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Huawei1_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int n = Integer.valueOf(str.charAt(0));
        String[] ss = str.split(" ");
        ArrayList<String> ret = new ArrayList<>();
        for (int i = 1; i< ss.length;i++){
            if (ss[i].length()>8){
                String temp = ss[i];
                int cnt = (ss[i].length())/8;
                String lastString = ss[i].substring(cnt*8);
                for (int k=0;k<cnt;){
                    String cutStr =ss[i].substring(k*8,8*(k+1));
                    k++;
                    ret.add(cutStr);
                }
                while (lastString.length()<8){
                    lastString+="0";
                }
                ret.add(lastString);
            }else {
                String temp = ss[i];
                while (temp.length()<8){
                    temp+="0";
                }
                ret.add(temp);
            }
        }
        Collections.sort(ret);
        for (int i = 0;i<ret.size();i++){
            System.out.print(ret.get(i)+" ");
        }

    }
}
