

public class code_57_1_ReverseSentence {
    public static String ReverseSentence(String str){
        char[] chars = str.toCharArray();
        int n = str.length();
        int i = 0,j=0;
        System.out.println(n);
        while (j<=n-1){
            if (j == n || chars[j] == ' '){
                reverse(chars,i,j-1);
                i = j+1;
            }
            j++;
        }
        System.out.println(new String(chars));
        reverse(chars,0,n-1);
        return new String(chars);

    }
  public static void reverse (char[] chars, int start, int end){
        while (start < end){
            swap(chars,start++,end--);
        }
    }
    public static void swap (char[] chars,int i ,int j ){
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    public static void main(String[] args) {
        System.out.println(ReverseSentence("I am a student."));
    }
}
