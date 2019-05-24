import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class code_20_isValid {
    public static Map<Character,Character>  mapping = new HashMap<>();
    static {
        mapping.put(')','(');
        mapping.put('}','{');
        mapping.put(']','[');
    }
    public static boolean isValid(String s) {
        if (s == null || s.length() ==0)
            return true;
        Stack<Character> stack = new Stack();
        for (int i = 0; i < s.length();i++ ){
            if (!stack.isEmpty() && mapping.get(s.charAt(i)) == stack.peek()){
                stack.pop();
            }else {
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();

    }
    public static void main(String[] args) {
        String str = "([)]";
        System.out.println(isValid(str));

    }
}
