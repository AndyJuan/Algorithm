import java.math.BigInteger;
import java.util.Scanner;

public class Toutiao {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int n = scann.nextInt();
        int m = scann.nextInt();
        int[] array = new int[n];
        for (int i = 0 ; i < n ; i ++ ){
            array[i] = scann.nextInt();
            System.out.println(array[i]);
        }
        int max =0;
        for (int i =0 ; i < n ; i++  ){
            if (max < array[i])
                max = array[i];
        }

        Double dow = 0.0;
        Double hig =(double) 2* max;
        int b =0;
        while ((hig- dow)>0.01 && b< m){
            Double mid = (dow +hig)/2;
            b =0;
            for (int j = 0; j < n ; j++){
                b += (int ) (array[j]/mid);
            }
            if (b < m){
                hig = mid;
            }else {
                dow = mid;
            }
        }
        System.out.println(String.format("%.2f",hig));


    }
}
