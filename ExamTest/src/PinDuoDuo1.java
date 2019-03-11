import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;
import java.util.Scanner;

public class PinDuoDuo1 {
    public static int[] ct;
    public static String removeDuplicate(String s){
        ct = new  int[52];
        return find(s);
    }
    public static String find(String s){
        if (s == null || s.equals("")){
            return "";
        }
        Arrays.fill(ct,0);
        for (char cur:s.toCharArray()){
            ++ct[cur-'a'];
        }
        int i = 0;
        int pos = 0;
        for (;i<s.length();++i){
            if (s.charAt(i)<s.charAt(pos)){
                pos = i ;
            }
            --ct[s.charAt(i)-'a'];
            if(ct[s.charAt(i)-'a'] == 0){
                break;
            }
        }
        return s.charAt(pos)+find(s.substring(pos+1).replace(""+s.charAt(pos),""));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
       s = s.toLowerCase();
        String s1 = removeDuplicate(s);
        char[] cc = s1.toCharArray();
        Arrays.sort(cc);
        System.out.println(cc[0]);

    }
}
