/**
 * 题目描述
 * 请从字符串中找出一个最长的不包含重复字符的子字符串，计算该最长子字符串的长度。
 *
 * 假设字符串中只包含从 a 到 z的字符。
 *
 * 解法
 * 动态规划。
 *
 * res[i] 表示以 s[i] 字符结尾的最长不重复字符串的长度。判断 s[i]：
 *
 * 若 s[i] 在前面没出现过，那么 res[i] = res[i - 1] + 1；
 * 若 s[i] 在前面有出现过，判断它上一次出现的位置 index 到 i 的距离 d 与 res[i - 1] 的大小关系：
 * 若 d <= res[i - 1]，说明它被包含在 res[i - 1] 构成的子串中，那么 res[i] = d；
 * 若 d > res[i - 1]，说明它在 res[i - 1] 构成的子串的左侧，那么 res[i] = res[i - 1] + 1。
 * 需要用一个数组 t 记录一下当前出现的字符在哪个位置。
 */

public class code_48_LongestSubstringWithoutDuplication {
    public static int longestSubstringWithoutDuplication(String s){
        if (s == null || s.length() == 0){
            return 0;
        }
        char[] chars = s.toCharArray();
        int[] t = new int[26];//存储26个字母出现的次数
        for (int  i = 0; i <26; ++i){
            t[i] = -1;
        }
        t[chars[0] - 'a'] =0;
        int n = chars.length;
        int[] res = new int[n];
        res[0] = 1;
        int max = res[0];
        for (int i = 1; i <n ;i++){
            int index = t[chars[i]-'a'];
            int d = i - index;
            res[i] = (index == -1 || d > res[i-1])
                    ? res[i-1] + 1
                    : d;
            t[chars[i] - 'a'] = i;
            max = Math.max(max, res[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "arabcacfr";
        System.out.println(longestSubstringWithoutDuplication(s));
    }
}
