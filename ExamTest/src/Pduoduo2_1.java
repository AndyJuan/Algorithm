import java.util.Arrays;
import java.util.Scanner;

public class Pduoduo2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        for(int i= 0; i< n ;i++){
            x[i] = sc.nextInt();
        }
        Arrays.sort(x);
        int max =  x[0] + x[n-1];
        int min = x[0] + x[n-1];
        for (int i = 0; i< n/2;i++){
            int temp = x[i] + x[n-i-1];
            if (temp > max)
                max = temp;
            if (temp < min )
                min = temp;
        }
        System.out.println(max - min);


    }
}
