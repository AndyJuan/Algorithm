import java.util.Scanner;


public class Toutiao2 {
    public static String Correct(String str){

            StringBuffer word = new StringBuffer(str);

            int i =0;
            while (i < word.length()){
                if (i > 3){
                    if (word.charAt(i) == word.charAt(i-1) && (word.charAt(i-1) == word.charAt(i-2) || word.charAt(i-2) == word.charAt(i-3))){
                        word.deleteCharAt(i-1);

                    }

                }
                if ((i+2)<word.length() && word.charAt(i) == word.charAt(i+1) && word.charAt(i+1) ==word.charAt(i+2)){
                    word.deleteCharAt(i);
                    continue;
                }
                i++;

            }


            return word.toString();

        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new  String[n+1];
        int k =0;
        while (sc.hasNextLine() ) {
             str[k++] = sc.nextLine();

             if (k == (n+1))
                 break;
        }
        sc.close();
        for (int j = 1; j < 2+1 ; j ++ ) {
             System.out.println(Correct(str[j]));
        }

    }
}
