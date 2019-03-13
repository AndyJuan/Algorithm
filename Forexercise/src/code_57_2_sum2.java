import java.io.FileInputStream;
import java.util.ArrayList;

public class code_57_2_sum2 {
    public static ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum){
        int small = 1;
        int big = 2;
        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
        int c = big + small;
        while (big < sum ){

            if (c>sum){
                c-=small;
                small++;
            }
            else if(c<sum){
                big++;
                c+=big;
            }else {
                ArrayList<Integer> list =new ArrayList<>();
                for (int j = small; j<=big; j++){
                    list.add(j);
                }
                ret.add(list);
                c-=small;
                small++;
                big++;
                c+=big;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
        ret = FindContinuousSequence(100);
        for (ArrayList<Integer> list : ret)
            System.out.println(list);

    }
}
