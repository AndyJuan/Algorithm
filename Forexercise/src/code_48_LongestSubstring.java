import com.sun.deploy.net.protocol.chrome.ChromeURLConnection;

import java.util.Arrays;

public class code_48_LongestSubstring {
    public static int longestSubstring (String s){
        if (s == null || s.length() == 0){
            return 0;
        }
        int[] location = new  int[26];//保存每个字符上一次出现的位置
        int curlength = 0;
        int maxlength=0;
        Arrays.fill(location,-1);
        for (int curI = 0; curI<s.length();curI++) {
            int c = s.charAt(curI) - 'a';
            int preI = location[c];//找上一个与之重复字符所在的位置
            if (preI == -1 || curI - preI > curlength) {
                curlength++;
            } else {
                maxlength = Math.max(maxlength, curlength);
                curlength = curI - preI;

            }
            location[c] = curI;
        }
        maxlength = Math.max(maxlength,curlength);
        return maxlength;

    }

    public static void main(String[] args) {
        System.out.println(longestSubstring("arabcacfr"));
    }
}
