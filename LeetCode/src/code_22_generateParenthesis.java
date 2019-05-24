import java.util.ArrayList;
import java.util.List;
//回溯法
public class code_22_generateParenthesis {
    public static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        backTrack(ans,"",0,0,n);
        return ans;

    }
    public static void backTrack(List<String> ans,String cur, int open ,int close,int max)
    {
        if (cur.length() == max*2){
            ans.add(cur);
            return;
        }

        if (open < max){
            backTrack(ans,cur+"(",open+1,close,max);
        }
        if (close < open){
            backTrack(ans,cur+")",open,close+1,max);

        }

    }

    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }
}
