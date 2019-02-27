public class code_21_reorder {
    public static void reOrderArray(int [] array) {
        if (array.length == 0 || array == null){
            return;
        }
        int p1 = 0;
        int p2 = array.length-1;
        while (p1<= p2){
            while (p1 <= p2 && !isOdd(array[p1])){
                p1++;
            }
            while (p1<= p2 && isOdd(array[p2])){
                p2--;
            }
            if (p1<= p2){
                int temp = array[p1];
                array[p1] = array[p2];
                array[p2] = temp;
            }
        }
    }

    public static boolean isOdd(int num){
        return (num & 1) == 0;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};

        reOrderArray(array);
        for (int i = 0 ; i < array.length ; i ++ ){
            System.out.println(array[i]);
        }


    }
}
