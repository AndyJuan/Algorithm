import java.util.Scanner;

public class Huawei22 {
    public static String decodeString(String s) {
        if(s==null||s.length()==0)
            return s;
        char ch;
        int index=0;
        int repeat=0;
        StringBuilder head=new StringBuilder(""),body=new StringBuilder("");
        while(index<s.length()&&!Character.isDigit(ch=s.charAt(index))){
            head.append(ch);
            index++;
        }
        if(index<s.length()){

            while(index<s.length()&&Character.isDigit(ch=s.charAt(index))){
                repeat=repeat*10+ch-'0';
                index++;
            }

            int rightBracket=index+1;
            int leftBracketNum=1;
            while(leftBracketNum>0){
                ch=s.charAt(rightBracket);
                if(ch==']' || ch== '}' || ch==')'){
                    leftBracketNum--;
                }
                else if(ch=='[' || ch=='{' || ch=='('){
                    leftBracketNum++;
                }
                else{

                }
                rightBracket++;
            }
            rightBracket--;
            String bodyStr=decodeString(s.substring(index+1,rightBracket));
            String tail=decodeString(s.substring(rightBracket+1));

            for(int i=1;i<=repeat;i++){
                body.append(bodyStr);
            }
            body.append(tail);
        }

        return head.toString()+body.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String res = decodeString(s);
        StringBuffer sb = new StringBuffer(res);
        System.out.println(res);
        System.out.println(sb.reverse());
    }
}