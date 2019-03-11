public class code_56_1_TheNumberTimes {
    public static void FindNumsAppearOnce(int [] array,int num1[] , int num2[]){
        if (array == null || array.length == 0){
            return;
        }
        StringBuffer s = new StringBuffer();
        int diff = 0;
        for (int num : array)
            diff ^= num;
        diff &=-diff;//得到右边第一位为1的，其余胃均为0 的数，取名为k
        System.out.println("DIFF="+diff);
        for (int num : array)
        {
            if ((num & diff) == 0) {
                num1[0] ^=num;//第k为0的所有数
                s.append(num);
            }else {
                num2[0] ^= num;//第k位为1 的所有数
            }
        }
        System.out.println("s="+s);
    }

    public static void main(String[] args) {
        int[] array = {2,2,4,6,3,3,5,5};
        int[] num1=new int[1];
        int[] num2=new int[1];
        FindNumsAppearOnce(array,num1, num2);
        System.out.println("num1="+num1[0]);
        System.out.println("num2="+num2[0]);

    }


}
