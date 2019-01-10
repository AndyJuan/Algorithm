
//题目：输入一个整数n，求从1到n这n个整数的十进制表示中1出现的次数。例如
//输入12，从1到12这些整数中包含1 的数字有1，10，11和12，1一共出现了5次。

/**思路：对于整数n，我们将这个整数分为三部分：当前位数字cur，更高位数字high，更低位数字low，
 * 如：对于n=21034，当位数是十位时，cur=3，high=210，low=4。 
 * 1、如果cur==0，则结果为 high*i 。
 * 2、如果cur==1，则结果为 high*i+low+1。
 * 3、如果cur>1，则结果为 (high+1)*i 。
 * cur=(n/i)%10;
 */
public class code_43_NumberOfBetweenIAndN {
    public  static  int NumberOfBetween1AndN (int n){
        int count =0;
        for (int i = 1; i <=n ; i*=10){//i代表位数
            int high = n/(i*10); //更高位的数字
            int low = n%i; //更低位的数字
            int cur = (n/i)%10; //当前数位
            if (cur == 0){
                count+= high*i;
            }else if (cur == 1){
                count+= high*i +(low +1);
            }else {
                count+=(high+1)*i;
            }
        }
        return count;
    }
}
