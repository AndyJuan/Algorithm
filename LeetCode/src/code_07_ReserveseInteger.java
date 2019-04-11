import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class code_07_ReserveseInteger {
    public static int reverse(int x) {
        boolean flag = true;
        if (x==0){
            return x;
        }
        if (x < 0 ){
            x=-x;
            flag = false;
        }
        Queue<Integer> queue = new LinkedList<>();
        while (x != 0) {
            queue.add(x%10);
            x=x/10;
        }
        String s ="";
        while (!queue.isEmpty()){
            s+=queue.poll();
        }
        System.out.println(s);
        int n =0;
        if (flag == false){
            try {
                n =-Integer.parseInt(s);
                if (n<Integer.MIN_VALUE){
                    return  0 ;
                }
            }catch (Exception e){
                return 0;
            }


        }else {
            try {
                n =Integer.parseInt(s);
            }catch (Exception e){
                return 0;
            }

        }
        return n;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int n = Integer.parseInt(s);
        System.out.println(reverse(n));
    }
}
