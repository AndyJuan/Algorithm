/**
 * 题目　
 * 　　在字符串中找出第一个只出现一次的字符。如输入"abaccdeff"，则输出'b'。
 *
 * 回到顶部
 * 思路
 * 　　创建哈希表，键值key为字符，值value为出现次数。第一遍扫描：对每个扫描到的字符
 * 的次数加一；第二遍扫描：对每个扫描到的字符通过哈希表查询次数，第一个次数为1的字
 * 符即为符合要求的输出。
 *
 * 　　由于字符（char）是长度为8的数据类型，共有256中可能，因此哈希表可以用一个长
 * 度为256的数组来代替，数组的下标相当于键值key，对应字符的ASCII码值；数组的值相
 * 当于哈希表的值value，用于存放对应字符出现的次数。
 *
 * 测试算例　
 *
 * 　　1.功能测试（存在/不存在只出现一次的字符；全部都为只出现一次的字符）
 *
 * 　　2.特殊测试（null）
 */

public class code_50_FirstNotRepeatingChar {
    public static int firstNotRepeatingChar(String str){
        if (str == null){
            //return '\0';
            return -1;
        }
        int[] repeatitions = new int[256];
        for (int i = 0; i < 256; i++){
            repeatitions[i] = 0;
        }
        for (int i = 0 ; i <str.length() ; i ++){
            int loc = (int) str.charAt(i);
            repeatitions[loc] += 1;
        }
        for (int i = 0; i < str.length(); i++) {
            int loc = (int ) str.charAt(i);
            if (repeatitions[loc] == 1){
                //return (char) loc;
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String s1 = "google";
        String s2 = "aabccdbd";
        String s3 = "$abcdefg";
        String s4 = "";

        System.out.println(firstNotRepeatingChar(s1));
        System.out.println(firstNotRepeatingChar(s2));
        System.out.println(firstNotRepeatingChar(s3));
        System.out.println(firstNotRepeatingChar(s4));
    }
}

