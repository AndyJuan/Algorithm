/**
 * 题目　
 * 　　我们把只包含因子2、3和5的数称作丑数（Ugly Number）。求按从小到大的顺序的第1500个丑数。例如6、8都是丑数，但14不是，因为它包含因子7。习惯上我们把1当做第一个丑数。
 *
 * 回到顶部
 * 思路
 * 　　直观思路：逐一判断每个整数是否为丑数，效率太低。
 *
 * 　　空间换时间的解法：
 *
 * 　　创建数组存放已经排序好的丑数，这将消耗一定的内存开销。根据丑数的定义，
 *    丑数应该是另一个丑数的2、3或者5倍的结果，因此，我们从数组中已有的丑数
 *    里找到三个丑数T2、T3、T5，它们分别和2、3、5相乘得到的值恰好比已有的最
 *    大丑数大，三个乘积中最小的一个就是下一个丑数，存放入数组中，同时更新T2、
 *    T3、T5，使它们仍然保持与2、3、5的乘积恰好比已有的最大丑数大。
 *
 * 测试算例　
 *
 * 　　1.功能测试（2，3，4，5等）
 *
 * 　　2.特殊测试（0，1）
 *
 * 　　3.性能测试（1500等）
 */
//题目：我们把只包含因子2、3和5的数称作丑数（Ugly Number）。求按从小到
//大的顺序的第1500个丑数。例如6、8都是丑数，但14不是，因为它包含因子7。
//习惯上我们把1当做第一个丑数。
public class code_49_UglyNumber {
    public int GetUglyNumber_Solution(int index){
        if (index <=0 ){
            return 0;
        }
        int[] uglyNumbers = new int[index];
        uglyNumbers[0]= 1;
        int index2 = 0;
        int index3 = 0;
        int index5 = 0;
        for (int i = 1; i < index; i++){
            uglyNumbers[i] =getMinmum(uglyNumbers[index2]*2,uglyNumbers[index3]*3,uglyNumbers[index5]*5);
            while (uglyNumbers[index2]*2 <= uglyNumbers[i] ){
                index2++;
            }
            while (uglyNumbers[index3]*3 <= uglyNumbers[i] ){
                index3++;
            }
            while (uglyNumbers[index5]*5 <= uglyNumbers[i] ){
                index5++;
            }
        }
        return uglyNumbers[index-1];
    }

    private int getMinmum (int a, int b, int c){
        if (a > b ){
            a=b;
        }
        if (a>c){
            a=c;
        }
        return a;
    }
}
