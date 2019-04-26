import java.util.Scanner;

public class code_08_atoi {
    public static int myAtoi(String str) {
        if ( str == null || str.length() == 0 || (str.charAt(0) != '-' && str.charAt(0) != ' '&&str.charAt(0) != '+') && (str.charAt(0)<'0'|| str.charAt(0)>'9') ){
            return 0;
        }
        int n =0;
        long num=0;
        int flag = 1;
        int bo = 0;
        boolean start =true;
        //题意要理解正确，正负号只能出现一次，
        // 且正负号和空格只能出现在数字的前面，
        // 数字之间有空格或者正负号都不行如“0-1”，"-   234"，"   +0 123"
        //只要正负号出现了一次，那么就不容许再有空格出现
        for (int i =0; i< str.length();i++){
            if(start ) {
                if (str.charAt(i)==' '){
                    n++;
                    continue;
                }
                if(str.charAt(i)=='-' || str.charAt(i)=='+'){
                    if (str.charAt(i)=='-'){
                        start = false;
                        flag=-1;
                        bo++;
                        if (bo>1){
                            num=0;
                            break;
                        }
                        continue;
                    }
                    if (str.charAt(i)=='+'){
                        start = false;
                        flag=1;
                        bo++;
                        if (bo>1){
                            num=0;
                            break;
                        }
                        continue;

                    }

                }

            }
          start = false;
          if (str.charAt(i)>='0' && str.charAt(i)<='9'){
                   num=num*10+Integer.valueOf(str.charAt(i)-'0');
                if(num*flag > Integer.MAX_VALUE)
                {
                    num=Integer.MAX_VALUE;
                    break;
                }
                if(num*flag < Integer.MIN_VALUE){
                    num=Integer.MIN_VALUE;
                    break;
                }

            }else {
                break;
            }
        }
        return (int)num*flag;

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(myAtoi(s));
//        System.out.println(0x7FFFFFFF);
//        System.out.println(0x80000000);
    }
}
