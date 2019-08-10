import java.util.ArrayList;
import java.util.Scanner;

public class pinduouduo_xuebao_2 {
    public static ArrayList<String> res = new ArrayList<>();
    public static Boolean flag = false;


    public static void judge(String[] arr,int n){
        fun(arr,n,0);
        if (res.get(0).charAt(0) != res.get(n-1).charAt(res.get(n-1).length()-1)){
            flag = false;
        }

    }

    public static void fun(String[] arr, int n, int k){
        if (k==n){
            for (int i =0; i< n;i++){
                res.add(arr[i]);
            }
            flag = true;
            return;
        }

        for (int i =k; i<n ;i++){
            if (k>0 && arr[k-1].charAt(arr[k-1].length()-1) == arr[i].charAt(0)){
                swap(arr,k,i);
                fun(arr,n,k+1);
                swap(arr,k,i);
            }else if(k==0){
                swap(arr,k,i);
                fun(arr,n,k+1);
                swap(arr,k,i);
            }

        }

        return;
    }

    public static  void swap (String[] arr, int s,int i){
        String temp ;
        temp = arr[s];
        arr[s]= arr[i];
        arr[i]=temp;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String[] word1 = str1.split(" ");
        judge(word1,word1.length);
        System.out.println(flag);
    }
}
