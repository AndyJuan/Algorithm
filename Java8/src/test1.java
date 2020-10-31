import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class test1 {
    public static void main(String[] args) {
        List<String> names1 = new ArrayList<String>();
        names1.add("Google ");
        names1.add("Runoob ");
        names1.add("Taobao ");
        names1.add("Baidu ");
        names1.add("Sina ");

        List<String> names2 = new ArrayList<String>();
        names2.add("Google ");
        names2.add("Runoob ");
        names2.add("Taobao ");
        names2.add("Baidu ");
        names2.add("Sina ");

        Collections.sort(names1,(s1,s2) -> s1.compareTo(s2));
        System.out.println(names1);

        Collections.sort(names1,(s1,s2) -> s2.compareTo(s1));
        System.out.println(names1);


        List<String> strings = Arrays.asList("abc","","bc","efg");

        long t1=1603878641; //2020-10-28 17:50:41
        long t2=1603878801;//2020-10-28 17:53:21


    }


}
