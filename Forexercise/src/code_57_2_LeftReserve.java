public class code_57_2_LeftReserve {
    public String LeftRotateString(String str,int n){
        if (n>str.length()){
            return str;
        }
        char[] chars = str.toCharArray();
        reverse(chars,0,n);
        reverse(chars,n+1,chars.length-1);
        reverse(chars,0,chars.length-1);
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
}
