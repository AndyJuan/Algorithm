import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Huawei1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String[] sss = str1.split(" ");
        int num  = Integer.parseInt(sss[0]);
        ArrayList<List<String>> ret =new ArrayList<List<String>>();
        for (int i = 1; i < sss.length ; i++) {
            if (sss[i].length()>8){
                List<String> cur = new ArrayList<>();
                int len = 8;
                int last = len;
                for (int begin = 0; begin <sss[i].length();){
                    if (last>sss[i].length()){
                        last = sss[i].length();
                        String ccc = sss[i].substring(begin,last);
                        while (ccc.length()<len){
                            ccc=ccc+"0";
                        }
                        cur.add(ccc);
                    }else {
                        cur.add(sss[i].substring(begin,last));
                    }
                    begin =last;
                    last = last+len;
                }
                ret.add(cur);
            }else{
                List<String> temp = new ArrayList<>();
                if (sss[i].length()<8){
                    String ccc = sss[i];
                    while (ccc.length()<8){
                        ccc=ccc+"0";
                    }
                    temp.add(ccc);
                }else {
                    temp.add(sss[i]);
                }
                ret.add(temp);
            }
        }
        List<String> ff =new ArrayList<>();
        for (int i=0;i<ret.size();i++){
            for(int j = 0;j<ret.get(i).size();j++){
                ff.add(ret.get(i).get(j));
            }
        }
        Collections.sort(ff);
        for (int i = 0;i<ff.size();i++){
            System.out.print(ff.get(i)+" ");
        }
    }
}
