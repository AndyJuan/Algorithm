public class code_38_countAndSay {
    public static  String countAndSay(int n) {
        int i = 2;


        StringBuilder preS = new StringBuilder("1");



        int curLen =1;
        while (i <= n){

            StringBuilder curS = new StringBuilder();

            int countCur=1;
            curLen = 1;
            while  (countCur <preS.length() ){
                if (preS.charAt(countCur) == preS.charAt(countCur-1)){
                    curLen++;
                    countCur++;
                }else {
                    curS.append(Integer.toString(curLen)+preS.charAt(countCur-1));
                    curLen = 1;
                    countCur++;
                }
            }
            curS.append(Integer.toString(curLen)+preS.charAt(countCur-1));
            preS=curS;
            i++;

        }
        return preS.toString();

    }
    public static String countAndSay2(int n) {
        String str = "1";
        for (int i = 2; i <= n; i++) {
            StringBuilder builder = new StringBuilder();
            char pre = str.charAt(0);
            int count = 1;
            for (int j = 1; j < str.length(); j++) {
                char c = str.charAt(j);
                if (c == pre) {
                    count++;
                } else {
                    builder.append(count).append(pre);
                    pre = c;
                    count = 1;
                }
            }
            builder.append(count).append(pre);
            str = builder.toString();
        }

        return str;
    }
    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }
}
