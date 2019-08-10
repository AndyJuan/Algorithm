import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class code_Maxvalue {
    //0-1背包问题
    public static void maxV(int total,int[] A ,int[] B){
        int N = A.length;
        int M = total;
        int[][]  f = new int[N+1][M+1];
        for (int i = 1; i <=N ; i++){
            for (int j = 1; j <=M ; j++){

                if(A[i-1] <= j){

                    f[i][j] = Math.max(f[i-1][j],f[i-1][j-A[i-1]]+B[i-1]);
                }else
                {
                    f[i][j] =f[i-1][j] ;
                }
            }

        }

        System.out.println(f[N][M]);

    }
public static int M2(int[] weight, int[] value, int capacity){
    int weightLen = weight.length;
    int valueLen = capacity + 1;//列值长度加1，是因为最后一列要保证重量值为lenColumn
    int maxValue = 0;
    int[][] v = new int[weightLen][valueLen];
    for (int i = 0; i < weightLen; i++) {
        for (int j = 0; j < valueLen; j++) {
            if (i == 0) {
                v[i][j] = 0;
            } else if (j == 0) {
                v[i][j] = 0;
            } else {
                if (weight[i] > j) {
                    v[i][j] = v[i - 1][j];

                } else if (weight[i] <= j) {
                    v[i][j] = Math.max(v[i - 1][j], v[i - 1][j - weight[i]] + value[i]);
                }
                maxValue = v[i][j];
            }

        }

    }
    return maxValue;


}
    public static void main(String[] args) {
        int[] A = {200,600,100,180,300,450};
        int[] B = {6,10,3,4,5,8};
        int total =1000;
        maxV(total,A,B);
        //System.out.println(M2(A,B,total));
    }
}
