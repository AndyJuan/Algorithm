
//打印字符串所有的子序列
public class Code_03_Print_All_Subsquences {

    public static void printAllSub (char[] str, int i, String res){
        if (i == str.length){
            System.out.println(res);//base case
            return;
        }
        printAllSub(str,i+1,res);//不要当前字符的路，res为当前字符
        printAllSub(str,i+1,res+String.valueOf(str[i]));//要当前字符的路
    }


    public static void main(String[] args) {
     String test = "abc";
     printAllSub(test.toCharArray(),0,"");
    }
}
