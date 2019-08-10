public class code_58_lengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        String[]  word = s.split(" ");
        int len = word.length-1;
        return len>=0 ? word[len].length() : 0;

    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("a"));
    }
}
