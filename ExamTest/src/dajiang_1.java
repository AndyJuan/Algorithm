import java.util.Scanner;

public class dajiang_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        System.out.println(LCS(str1,str2));

    }

    public static String LCS (String str1, String str2){
        if (str1 == null || str2 == null){
            return null;
        }
        if (str1.equals("") || str2.equals("")){
            return null;
        }

        int len1 = str1.length();
        int len2= str2.length() ;

        int[] topLine = new int[len1];
        int[] currentLine = new int[len1];

        int maxLen =0;
        int pos =0;

        char ch = ' ';

        for (int i = 0; i < len2; i++){
            ch = str2.charAt(i);
            for (int j = 0; j < len1; j++){
                if (ch == str1.charAt(j) ){
                    if (j==0) {
                        currentLine[j] = 1;
                    }
                    else {
                        currentLine[j] = topLine[j-1]+1;
                    }
                    if (currentLine[j]>maxLen){
                        maxLen = currentLine[j];
                        pos=j;
                    }
                }
            }
            for (int k =0; k < len1;k++){
                topLine[k ]= currentLine[k];
                currentLine[k]=0;
            }
        }


        return str1.substring(pos-maxLen+1,pos+1);
    }
}
