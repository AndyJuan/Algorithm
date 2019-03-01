import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class code_38_StringSort {
    private ArrayList<String> ret = new ArrayList<>();
    public ArrayList<String> Permutation(String str){
        char[] s = str.toCharArray();
        if (s.length ==0 || s == null) {
            return ret;
        }

        permutate(s,0,s.length-1);
        Collections.sort(ret);
        return ret;
    }

    private void permutate(char[] s, int from , int to){
        if (from == to ){
            ret.add(new String(s));
        }
        for(int i = from ; i <= to ; i++){
            if (i==from || s[i]!=s[from]) {
                swap(s, i, from);
                permutate(s, from + 1, to);
                swap(s, from, i);
            }
        }

    }

    private void swap(char[] s, int a, int b){
        char temp = s[a];
        s[a] = s[b];
        s[b] = temp;
    }

    public static void main(String[] args) {
        ArrayList<String> reet = new ArrayList<>();
        String s="aab";
        code_38_StringSort a =new code_38_StringSort();
        reet = a.Permutation(s);
        for (int i = 0; i < reet.size();i++){
            System.out.println(reet.get(i).toString());
        }

    }
}
