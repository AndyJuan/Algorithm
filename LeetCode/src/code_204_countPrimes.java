public class code_204_countPrimes {
    public int countPrimes(int n) {
        int count =0;
        for (int i = 2; i < n;i++){
            if (isPrime(i)){
                count ++;
            }
        }

    return count;
    }
    public static boolean isPrime(int n){
        if(n == 2 )
            return true;
        for (int i = 2; i <= Math.sqrt(n);i++){
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(17));
    }
}
