import java.util.Arrays;
import java.util.Scanner;

public class Xiecheng1 {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        String ss = in.nextLine();
        String[] s = ss.split(",");

        int fast = 0;
        int slow= 0;
        int n = s.length;
        int[] word = new int[256];
        boolean flag = false;
        Arrays.fill(word,-1);
        for(int i= 0; i < n; i++){
            if (word[(int)s[i].toCharArray()[0]]== 1){
                flag = true;
            }
            word[(int)s[i].toCharArray()[0]] = 1;
        }
        System.out.println(flag);

    }



}
