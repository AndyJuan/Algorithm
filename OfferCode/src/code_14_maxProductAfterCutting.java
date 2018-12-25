/**
 * 描述：给一段长度位整数n的绳子，剪成若干段，每段长度也是整数，计算这些长度的乘积的最大值。
 * 思路：比较容易想到的动态规划以及乍看起来让人蒙圈的贪婪法。无论是那种方法，能做出来就不容易。
 * 考点：抽象建模能力；对动态规划和贪婪发的理解。
 */

public class code_14_maxProductAfterCutting {
    //动态规划算法，避免重复，采用从上往下分析问题，从下往上解决问题
    public static int maxProduct_s1(int len){
        if (len < 2) return 0;
        if (len == 2) return 1;
        if (len == 3) return 2;

        int[] products = new int[len +1];
        products[0] = 0;
        products[1]= 1;
        products[2]= 2;
        products[3]= 3;
        int max = 0;
        for (int i = 4; i <=len; i++){ //此处是小于等于
            for (int j = 1; j <= i/ 2; j++){
                int  product = products[j] *products[i-j];
                if (max < product){
                    max = product;
                }
                products[i] = max;
            }
        }
        return  max;
    }

    //贪婪算法，
    public static int maxProduct_s2 (int len ){
        if (len < 2) return 0;
        if (len == 2) return 1;
        if (len == 3) return 2;
        // 尽可能多地剪去长反为3 的绳子段
        int timeOf3 = len/3;
        //如果最后只剩长度为4了，那么剪成2段2段乘积比较大
        if (len - timeOf3*3 == 1){
            timeOf3--;
        }
        int timeOf2 = (len - timeOf3*3)/2;
        return (int)(Math.pow(3,timeOf3))*(int)(Math.pow(2,timeOf2));

    }

    // 测试
    public static void main(String[] args) {
        System.out.println(maxProduct_s1(20));
        System.out.println(maxProduct_s2(20));
    }
}
