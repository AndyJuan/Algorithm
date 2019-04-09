import java.util.Scanner;

public class TENXUN2_2 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String num = sc.nextLine();
//        int n = Integer.valueOf(num);
//        String s = sc.nextLine();
        String s = "1110";
        StringBuffer word = new StringBuffer(s);
        System.out.println(word.toString());
        int i = 0;
        while (i < word.length()-1){
            if (word.charAt(i) == '0' && word.charAt(i+1) == '1'){
                word.deleteCharAt(i);
                word.deleteCharAt(i);
                if (i>0) {
                    i--;
                }
                System.out.println("1:"+word.toString()+" "+word.length()+" ");
            }else if (word.charAt(i) == '1' && word.charAt(i+1) == '0'){
                word.deleteCharAt(i);
                word.deleteCharAt(i);
                if (i>0) {
                    i--;
                }
                System.out.println("2:"+word.toString()+" "+word.length()+" ");
            }else{
                i++;
            }

        }
        int n = word.length();
        System.out.println(n);
    }
}
