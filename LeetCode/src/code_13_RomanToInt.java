import java.util.LinkedHashMap;

public class code_13_RomanToInt {
    private  static LinkedHashMap<String,Integer> MAP = new LinkedHashMap<>();
    static {
        MAP.put("M", 1000);
        MAP.put("CM", 900);
        MAP.put("D", 500);
        MAP.put("CD", 400);
        MAP.put("C", 100);
        MAP.put("XC", 90);
        MAP.put("L", 50);
        MAP.put("XL", 40);
        MAP.put("X", 10);
        MAP.put("IX", 9);
        MAP.put("V", 5);
        MAP.put("IV", 4);
        MAP.put("I", 1);
    }
    public static int romanToInt(String s) {
        int num=0;
        int i =0;
        while (i <=s.length()-1){
            if (i+2<=s.length() && MAP.get(s.substring(i,i+2))!=null){//此处注意不是i+2<=s.length()-1，因为子串最后那个位置是取不到的
                num = num+MAP.get(s.substring(i,i+2));
                i=i+2;
            }else {
                num = num+MAP.get(s.charAt(i)+"");
                i++;

            }
        }

        return num;

    }

    public static void main(String[] args) {
       System.out.println(romanToInt("MCMXCIV"));

    }
}
