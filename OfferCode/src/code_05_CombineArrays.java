import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Arrays;

//合并两个有序数组，归并排序
public class code_05_CombineArrays {
    public static  int[] mergeSortedArrays(int[] A, int[] B) {
        if (A == null || B == null)
            return null;
        if (A.length == 0 || B.length == 0)
            return A.length == 0 ? B : A;
        ArrayList<Integer> C = new ArrayList<>();
        int a = 0;
        int b = 0;
        while (a < A.length || b < B.length) {
            if (a == A.length && b <= B.length){
                C.add(B[b++]);
            }else if (a < A.length && b == B.length){
                C.add(A[a++]);
            }else {
                if (A[a] >= B[b]) {
                    C.add(B[b++]) ;

                } else {
                    C.add(A[a++]) ;
                }
            }
        }
        int[] d = new int[C.size()];
        for (int i = 0; i < d.length; i++){
            d[i]=C.get(i);
        }
       return d;
    }
    public static void main(String[] args) {
        int A[] = {1,2,7,85,374};
        int B[] = {13,22,32,85,87};
        int[] d = null;
        d=mergeSortedArrays(A,B);
        for (int i = 0; i < d.length; i++){
            System.out.println(d[i]);
        }
        System.out.println(d);
    }
}

