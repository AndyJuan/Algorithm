import sun.rmi.log.LogInputStream;

import java.util.*;

public class jdong1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       String m1 = in.nextLine();
        int m = Integer.valueOf(m1);
        ArrayList<String> ret = new ArrayList<>();
        for (int i =0; i < (m+1);i++){
            String str1 = in.nextLine();
            ret.add(str1);
        }
        String patten = ret.get(m);
        int len = patten.length();
        int[] flag = new int[len];
        Arrays.fill(flag,0);
        ArrayList<ArrayList<Integer>> number = new ArrayList<>();
        for (int i =0; i < ret.size();i++){
            String temp = ret.get(i);
            ArrayList<Integer>  list = new ArrayList<>();
            for (int j = 0; j < temp.length();j++){
                int index = patten.indexOf(temp.charAt(j));
                list.add(index);
            }
            StringBuffer sss = new StringBuffer(patten);
            for (int k = 0;k < list.size();k++){
                if (list.get(k)>=0)
                    sss.setCharAt(list.get(k),'#');
            }
            patten = sss.toString();
            number.add(list);
        }
        ArrayList<ArrayList<Integer>> count = new ArrayList<>();

        for (int i = 0; i < number.size();i++){
            boolean dp = true;
            ArrayList<Integer> list = new ArrayList<>(new HashSet<Integer>(number.get(i)));
            for (int j = 0; j< list.size(); j++){
                if (flag[list.get(j)] == -1){
                     dp = false;
                }
                flag[list.get(j)] = -1;
            }
            if (dp == true){
                count.add(list);
            }
        }
        System.out.println(count.size());





    }
}
