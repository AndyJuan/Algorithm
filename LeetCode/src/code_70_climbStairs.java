public class code_70_climbStairs {
    public static int climbStairs(int n) {
        if (n ==1)
            return 1;
        if (n == 2) {
            return 2;
        }

        int one = 1;
        int two = 2;

        int num =0;
        for (int i = 3; i<=n ; i++){
            num = one + two;
            one = two;
            two = num;

        }
        return num;

    }

    public static void main(String[] args) {
        System.out.println(climbStairs(5));

    }
}
