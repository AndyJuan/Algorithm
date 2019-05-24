public class code_28_strStr {
    public static int strStr(String haystack, String needle) {
        if (haystack.length() == 0 && needle.length() == 0){
            return 0;
        }
         if (haystack == null ||  needle.length()>haystack.length())  {
             return -1;
         }
         if (needle == null  ){
             return 0;
         }
         int i =0;
         int j = 0;
        int location=0;
         while (i < haystack.length() && j< needle.length()){
             if (haystack.charAt(i) == needle.charAt(j)){
                 if (j == 0){
                      location = i;
                 }
                 i++;
                 j++;
                 if (j == needle.length()-1){
                     return location;
                 }
             }else {
                 i++;
                 j=0;
             }
         }
         return -1;
    }

    public static void main(String[] args) {
        String s1 = "abbaa";
        String s2 =  "bba";
        System.out.println(strStr(s1,s2));
        System.out.println(strStr("",""));
    }
}
