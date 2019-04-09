import java.util.Stack;

public class Huawei_05_LongestHuiwen {
    public String longestPalindrome(String s) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        int n = s.length()-1;
        for (int i = 0; i < s.length() ; i++ ){
            stack1.add(s.charAt(i));
            stack2.add(s.charAt(n-i));
        }
        return null;

    }
}
