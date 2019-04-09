import java.util.Arrays;

public class code_03_NoReapeatWord {
    public static int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0 || s == ""){
            return 0;
        }
        int max = 0;
        int pre = 0;
        int cur = -1;
        int len = 0;
        char[] word = s.toCharArray();
        int[] item = new int[128];
        Arrays.fill(item,-1);
        for(int i =0; i< word.length; i++){

            cur++;
            if(item[word[i]] != -1 && item[word[i]] >= pre){
                if(item[word[i]] == pre){
                    pre++;
                }else{
                    pre = item[word[i]] + 1;
                }
            }
            len = cur - pre +1;
            if(max < len ){
                max = len;
            }
            item[word[i]] = i;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("tmmzuxt"));
    }
}
