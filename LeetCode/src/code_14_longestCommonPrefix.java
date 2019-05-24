public class code_14_longestCommonPrefix {
    //解题思路：
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";
        String prefix = strs[0];
        for (int i= 0; i < strs.length;i++){
            while (strs[i].indexOf(prefix) !=0){
                prefix = prefix.substring(0,prefix.length()-1);
                if (prefix == null)
                    return "";
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String string = "abdcfdgdc";
        System.out.println(string.indexOf("cf"));
        System.out.println(string.lastIndexOf("dc"));
    }
}
