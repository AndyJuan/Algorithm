import java.util.LinkedHashMap;
import java.util.Map;

public class code_12_IntegerToLuoma {
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
    public static String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();

            for (Map.Entry<String,Integer> e : MAP.entrySet()){
                if (num !=0){
                    int ret = num/e.getValue();//num要先除，再取余赋值给本身，顺序不能反
                    num=num%e.getValue();
                    while (ret !=0){
                        sb.append(e.getKey());
                        ret--;
                    }
                }else {
                    break;
                }


            }
            return sb.toString();
    }

    public static void main(String[] args) {

        System.out.println(intToRoman(1994));
    }
}
