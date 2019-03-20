import java.util.Scanner;

public class Huawei_02_update {
    public static int numberOfButtle (int num){
        if (num < 1)
            return 0;
        int count = 0;
        int ret = 0;
        while (num != 1 ){
            count +=  (int)num/3;
            num = (int)num/3 + num%3;
            if (num == 2){
                count++;
                break;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int num = sc.nextInt();
            System.out.println(numberOfButtle(num)+"");
        }
    }
}
