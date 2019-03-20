import java.util.Scanner;

public class Huawei_01_LastLengthOfWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] word = str.split(" ");
        int n = word.length-1;
        System.out.println(word[n].length());
    }
}
