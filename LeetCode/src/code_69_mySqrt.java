public class code_69_mySqrt {
    //二分搜索算法
    public static int mySqrt(int x) {
        int left = 0;
        int mid = (0+x)/2;
        int right=0;
        if (x > 46340){
           right = 46340;
        }else {
             right = x/2+1;
        }



        while (left<=right){
            mid = (right+left)/2;
            if (mid * mid > x){
                right = mid -1;
            }else if(mid * mid < x){
                left = mid+1;
            }else {
                return mid;
            }
        }

            return left-1;




    }
    //方法二：牛顿迭代算法：牛顿法解f(x)=0的迭代公式是next=cur-f(x)/f'(x)
    public static int mySqrt2(int x){
        if (x==0){
            return x;
        }
        double last = 0;
       double cur = 1;
        while (cur!=last){
            last = cur;
            cur = (cur*cur+x)/(2*cur);
        }
        return (int)cur;

    }

    public static void main(String[] args) {
        System.out.println(mySqrt2(2147483647));
        System.out.println(mySqrt2(9));
    }
}
