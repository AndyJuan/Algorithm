import java.util.Scanner;

public class yuanjing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        String str = str1.substring(1, str1.length() - 1);
        int k = Integer.valueOf(str2);
        String[] IP = str1.split("\\.");

        int[] num = new int[IP.length];
        StringBuffer sss = new StringBuffer();
        for (int i = 0; i < IP.length ; i++) {
            num[i]=Integer.valueOf(IP[i]);
        }
        String strr = "";
        for (int i = 0; i < num.length ; i++) {
            int res = num[i];
            String st = "";
            while (res !=0){
                st = res%2 +st;
                res=res/2;
            }
            int cnt = st.length();
            for (int j = cnt; j < 8;j++)
            {
                st= "0"+st;
            }
            strr = strr+st;
        }
        System.out.println(strr);
        int number = Integer.parseInt(strr,2);
        //System.out.println(number+"");
        System.out.print(sss.toString());
        long num2 = Integer.valueOf(str2);
        String strr2 = "";
        while (num2 !=0){
            strr2 = num2%2 +strr2;
            num2=num2/2;
        }

        while (strr2.length()<32){
            strr2="0"+strr2;
        }
        //System.out.println(strr2);
        String s1 = strr2.substring(0,8);
        String s2 = strr2.substring(8,16);
        String s3 = strr2.substring(16,24);
        String s4 = strr2.substring(24);

        int n1 = Integer.parseInt(s1,2);
        int n2 = Integer.parseInt(s2,2);
        int n3 = Integer.parseInt(s3,2);
        int n4 = Integer.parseInt(s4,2);

        String ssss = n1+"."+n2+"."+n3+"."+n4;
        System.out.print(ssss);

    }
}
