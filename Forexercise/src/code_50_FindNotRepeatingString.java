public class code_50_FindNotRepeatingString {
    public int FirstNotRepeatingChar(String str){
        if (str == null || str.length() == 0)
            return -1;
        int[] cnt = new int[256];
        for (int i =0 ; i < str.length();i++){
            cnt[str.charAt(i)]++;
        }
        for (int i = 0; i< str.length(); i++){
            if (cnt[str.charAt(i)] == 1 )
                return i;
        }
        return -1;

    }
}
