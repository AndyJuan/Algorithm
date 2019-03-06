
public class code_43_numberOf1 {
    public  int NumberOf1Between1AndN_Solution(int n) {
        if (n < 0) {
            return 0;
        }
        String s = n + "";
        return NumberOf1(s);
    }

    private int NumberOf1 (String s){
        char[] str = s.toCharArray();
        int length = str.length;
        if (length == 1 && str[0] =='0'){
            return 0;
        }
        if (length == 1 && str[0] >= '1'){
            return 1;
        }
            int numberFirst = 0;
        if (str[0] > '1'){
             numberFirst = (int)Math.pow(10,length-1);
        }
        else if (str[0] == '1'){
            numberFirst = Integer.parseInt(s.substring(1))+1;
        }
        int numOther = (int) ((str[0]-'0')*(length-1)*Math.pow(10,length-2));
        int numRecuise = NumberOf1(s.substring(1));
        return numberFirst+numOther+numRecuise;

    }

    public static void main(String[] args) {
        code_43_numberOf1 e =new code_43_numberOf1();
        System.out.println(e.NumberOf1Between1AndN_Solution(21345));
    }
}
