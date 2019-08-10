import java.util.Stack;

public class code_66_addBinary {
    public static String addBinary(String a, String b) {
        StringBuilder string = new StringBuilder();
        int num= 0;
        int bit = 0;
        int i=a.length()-1,j=b.length()-1;
       // System.out.println(Integer.parseInt(a.charAt(i)+"")+Integer.parseInt(b.charAt(j)+"")+bit);
        while (i>=0 && j >=0 ){
            num = (Integer.parseInt(a.charAt(i)+"")+Integer.parseInt(b.charAt(j)+"")+bit)%2;
            bit = (Integer.parseInt(a.charAt(i)+"")+Integer.parseInt(b.charAt(j)+"")+bit)/2;
            string.append(num);
            i--;
            j--;
        }
        if (i >= 0){
            while (i>=0  ){
                num = (Integer.parseInt(a.charAt(i)+"")+bit)%2;
                bit = (Integer.parseInt(a.charAt(i)+"")+bit)/2;
                string.append(num);
                i--;
            }
        }
        if (j >= 0){
            while (j>=0  ){
                num = (Integer.parseInt(b.charAt(j)+"")+bit)%2;
                bit = (Integer.parseInt(b.charAt(j)+"")+bit)/2;
                string.append(num);
                j--;
            }
        }
        if (bit>0){
            string.append(bit);
        }

        return string.reverse().toString();

    }
    //下面是人家简化版的，代码量小
    public static String addBinary2(String a, String b) {
        StringBuilder res = new StringBuilder();
        int ia = a.length() - 1;
        int ib = b.length() - 1;
        int carry = 0;
        while(ia >= 0 || ib >= 0 || carry > 0){
            carry += (ia >= 0) ? a.charAt(ia--) - '0' : 0;
            carry += (ib >= 0) ? b.charAt(ib--) - '0' : 0;
            res.append(carry % 2);
            carry = carry / 2;
        }
        return res.reverse().toString();
    }

    public static void main(String[] args) {
        String a="1010";
        String b ="1011";
        System.out.println(addBinary(a,b));
    }
}
