public class code_17_exercise2 {
    public static void Print1toN(int n ){
        if (n < 0){
            System.out.println("输入的数字没有意义");
            return;
        }
        char[] num = new char[n];
        for (int i = 0; i < num.length; i ++){
            num[i]= '0';

        }
        for (int i = 0; i <10; i++){
            num[0] = (char) (i+'0');
            print1ToDigta(num,n,0);

        }

    }
    public static void print1ToDigta (char[] num,int n ,int index){
        if (index == n -1){
            printNum(num);
            return ;
        }
        for (int i = 0; i< 10; i++){
            num[index+1] =(char) (i+'0');
            print1ToDigta(num,n,index+1);
        }
    }
    public static void printNum(char [] num){
//         int nlength = num.length;
//         boolean isBegining = true;
//         for(int i = 0; i < nlength; i++){
//             if (isBegining && num[i] != '0')
//                 isBegining = false;
//             if (!isBegining){
//                 System.out.print(num[i]);
//             }
//         }
        int dig = 0;
        while (dig < num.length && num[dig] == '0')
            dig++;
        while (dig < num.length)
            System.out.print(num[dig++]);
        System.out.println();
    }

    public static void main(String[] args) {
       Print1toN(2);
    }
}
