public class code_28_strStr {
    public static int strStr(String haystack, String needle) {

         if (haystack == null &&  needle!=null || haystack.length() == 0 &&  needle.length()!=0)  {
             return -1;
         }
         if (haystack == null || needle == null  ){
             return 0;
         }
         if (haystack.length() == 0 || needle.length() == 0 )
             return 0;
         int i =0;
         int j = 0;
        int location=0;
         while (i < haystack.length() && j< needle.length()){
             if (haystack.charAt(i) == needle.charAt(j)){
                 if (j == 0){
                      location = i;
                 }
                 if (j == needle.length()-1){
                     return location;
                 }
                 i++;
                 j++;

             }else {
                 i=i-j+1;
                 j=0;
             }
         }
         return -1;
    }
    public static int f2(String haystack, String needle){//同样暴力法
        int heyL= haystack.length();
        int needL = needle.length();
        int i = 0;
        int j =0;
        while (i < heyL && j< needL){
            if (haystack.charAt(i) == needle.charAt(j)){
                i++;
                j++;
            }else {
                i=i-j+1;
                j=0;
            }
        }
        if (j == needle.length()-1){
            return i-j;
        }else {
            return -1;
        }
    }
    public static void main(String[] args) {
        String s1 = "abbaa";
        String s2 =  "bba";
       // System.out.println(strStr(s1,s2));
        System.out.println("f2"+f2("mississippi","issip"));
        System.out.println(strStr("mississippi","issip"));
    }
}
