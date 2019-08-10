import java.util.Scanner;

public class pingduoduo_xuebao_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        String[] word1 = str1.split(" ");
        int[] num1 = new int[word1.length];
        for (int i = 0; i < word1.length ; i++) {
            num1[i] = Integer.valueOf(word1 [i]);
        }

        String[] word2 = str2.split(" ");
        int[] num2 = new int[word2.length];
        for (int i = 0; i < word2.length ; i++) {
            num2[i] = Integer.valueOf(word2 [i]);
        }

        if (num2 == null || num2.length == 0){
            System.out.print("NO");
            return;
        }
        int curNum1 = 0;
        int curNum2 = 0;
        for (int i=0; i< num1.length-1;i++){
            if (num1[i]>=num1[i+1]){
                curNum2=i+1;
                curNum1 = i;
                break;
            }
        }

        int max1 =Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int j = 0; j< num2.length;j++) {
            if (curNum2 == num1.length - 1){
                if (num2[j] > num1[curNum2 ] ) {
                    max2 = Math.max(max2, num2[j]);
                }
            }else{
                if (num2[j] > num1[curNum2 - 1] && num2[j] < num1[curNum2 + 1]) {
                    max2 = Math.max(max2, num2[j]);
                }
            }



            if (curNum1 > 0) {
                if (num2[j] > num1[curNum1 - 1] && num2[j] < num1[curNum1 + 1]) {
                    max1 = Math.max(max1, num2[j]);
                }
            } else {
                    if (num2[j] < num1[curNum1 + 1]) {
                        max1 = Math.max(max1, num2[j]);
                    }
                }
        }

        if (max1>=max2){
            num1[curNum1] = max1;
        }else {
            num1[curNum2] = max2;
        }

        if (max1 == 0 && max2 == 0){
            System.out.print("NO");
        }else {
            for (int i = 0; i < word1.length; i++) {
                System.out.print(num1[i]);
                System.out.print(" ");
            }
        }
    }

}
