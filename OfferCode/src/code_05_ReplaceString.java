//描述：将字符串中的每个空格替换成%20。如输入"we are fine"，输出"we%20are%20fine"。
// 思路：原题考察了C++中指针的操作。Java里数组不可变，因此本题变得没有难度了。利用String对象的.charAt函数遍历每个字符，并使用StringBuilder构建新的字符串。
//  考点：对字符串的处理。


import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
//时间复杂都和空间复杂都为O（n）
public class code_05_ReplaceString {
     //在Java中字符串时不可变的，因而只能构造一个新的字符串。原文中该题的难点也无法体现出来了。
    public static String replceBlank(String string){
        if (string == null) {
            return  null;
        }
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i< string.length(); i ++){
            if (String.valueOf(string.charAt(i)).equals(" ")){
                sb.append("%20");
            }else {
                sb.append(string.charAt(i));
            }
        }

        return String.valueOf(sb);
    }
    public static String replceBlank2(String string){
        if (string == null) {
            return  null;
        }
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i< string.length(); i ++){
            if (string.charAt(i) == ' '){
                sb.append("%20");
            }else {
                sb.append(string.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str1 = "We are happy";
        String str2 = " We are happy";
        String str3 = "We are happy ";

        System.out.println(replceBlank(str1));
        System.out.println(replceBlank(str2));
        System.out.println(replceBlank(str3));

        System.out.println(replceBlank2(str1));
        System.out.println(replceBlank2(str2));
        System.out.println(replceBlank2(str3));
    }
}
