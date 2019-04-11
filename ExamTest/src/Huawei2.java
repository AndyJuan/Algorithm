import java.util.Scanner;
import java.util.Stack;

public class Huawei2 {
    public static String zhanKai(String s){
        if (s == null || s.length() == 0)
            return s;
        char ch;
        int aaa = 0;
        int repeat =0;
        StringBuilder head = new StringBuilder(""),body = new StringBuilder("");
        while(aaa < s.length() && !Character.isDigit(ch=s.charAt(aaa))){
            head.append(ch);
            aaa++;
        }
        if (aaa<s.length()) {
            while (aaa < s.length() && Character.isDigit(ch = s.charAt(aaa))) {
                repeat = repeat * 10 + ch - '0';
                aaa++;
            }

            int right = aaa + 1;
            int ccc = 1;
            while (ccc > 0) {
                ch = s.charAt(right);
                if (ch == ']' || ch == '}' || ch == ')') {
                    ccc--;
                } else if (ch == '[' || ch == '{' || ch == '(') {
                    ccc++;
                } else {

                }
                right++;
            }
            right--;
            String Str = zhanKai(s.substring(aaa + 1, right));
            String sss = zhanKai(s.substring(right + 1));

            for (int i = 1; i <= repeat; i++) {
                body.append(Str);
            }
            body.append(sss);
        }
        return head.toString()+body.toString();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String sss = zhanKai(s);
        StringBuffer sb = new StringBuffer(sss);
        System.out.println(sb.reverse());


    }
}
