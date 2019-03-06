public class code_44_getDigitAtIndex {
    private int getDigitAtIndex(int n){
        if (n<=0){
            return -1;
        }
        int m =1;
        while (true){
            long digit = countOfInterger(m);//digit是总共有多少个m位数，一共多少位的话还需要乘以m
            if (n < digit*m) {
                break;
            }
            n -= digit*m;
            ++m;
        }
        return GetThenumber(m,n);

    }

    //得到m位数有多少个数，比如100~999有900个数，
    private int countOfInterger(int m ){
        return m == 1 ?  10 : (int)(9*Math.pow(10,m-1));
    }

    //得到所在的m位数区间的那个数
    private int GetThenumber(int m, int n){
        int beginNumber = GetBeginNumber(m);
        int val = beginNumber + n/m;
        int count = m - n%m;
        for (int i = 1; i<count;++i){
            val = val/10;
        }
        return val%10;
    }

    //得到m位数的开始位数，比如2位数是10，三位数是100
    private int GetBeginNumber(int m){
        return m == 1? 0 : (int)(Math.pow(10,m-1));
    }

    public static void main(String[] args) {
        code_44_getDigitAtIndex e = new code_44_getDigitAtIndex();
        System.out.println(e.getDigitAtIndex(1000));
    }
}
