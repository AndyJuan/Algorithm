//import java.util.Arrays;
//public class Code_04_InversPairs {
//    public static int inversePairs (int[] arr){
//        if (arr == null || arr.length <2)
//            return 0;
//        return mergeSort(arr, 0, arr.length -1);
//    }
//
//    public static int  mergeSort (int[] arr, int l, int r){
//        if (l == r) {
//            return 0;
//        }
//        // int mid =1 +  //(l+r)/2
//        int mid = l + ((r - l) >> 1); //刚开始这里写成了 1， 导致老是出错，所以以后取字母要避免类似的错误，尽量不要去这些容易弄混的单词
//        return mergeSort(arr,l,mid) +   mergeSort(arr,mid+1,r) + merge(arr,l,mid,r); //小和等于这三部分各自的小和之和：左小和，又小和，合并之后的小和
//    }
//
//    public static  int merge (int[] arr , int l, int m, int r){
//        int [] help = new int [r-l +1];
//        int i =0;
//        int p1= l;
//        int p2=m+1;
//        int res=0; //小和
//        while(p1<=m && p2<=r){
//            if (arr[p1] > arr [p2]){
//                for (int j = p1; i<= m; i++){
//                    System.out.println(arr[j]+" " +arr[p2]);
//                }
//            }else{
//            res += arr[p1] < arr[p2] ? (r-p2 +1 )* arr[p1]  : 0;//左边小和已经在迭代的过程中计算出来了，然后只要把左边的数和右边比较，把小于右边的那些数的小和计算出来
//            help[i++]= arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
//        }
//
//        while (p1 <= m ) {
//            help[i++] = arr[p1++];
//        }
//
//        while (p2<=r){
//            help[i++]=arr[p2++];
//        }
//
//        for (i = 0; i < help.length ; i ++){
//            arr[l+i] = help [i];
//        }
//        return  res;
//    }
//
//        public static int comparator (int[] arr){
//            if (arr == null || arr.length <2){
//                return 0;
//            }
//
//            int res =0;
//            for (int i = 1; i < arr.length ; i++){
//                for (int j = 0; j < i; j ++){
//                    res += arr[j] < arr [i] ? arr[j] : 0;
//                }
//
//            }
//            return  res;
//        }
//
//        public static int[] generateRandomArray(int maxSize , int maxValue ){
//            int[] arr= new int[(int) ((maxSize + 1) * Math.random())];
//            for (int i =0; i < arr.length ; i++){
//                arr[i] = (int)  ((maxValue + 1) * Math.random())- (int)((maxValue ) * Math.random());
//            }
//            return arr;
//        }
//
//        public static int [] copyArray (int [] arr){
//            if (arr == null){
//                return null;
//            }
//            int [] res = new int[arr.length];
//            for (int i =0 ; i< arr.length; i++) {
//                res[i] =arr[i];
//            }
//            return  res;
//        }
//
//        public static boolean isEqual(int[] arr1, int[] arr2){
//            if ((arr1 == null && arr2 != null) || (arr1 != null && arr2 == null)){
//                return false;
//            }
//
//            if (arr1 ==null && arr2 == null){
//                return  true;
//            }
//
//            if(arr1.length != arr2.length){
//                return false;
//            }
//
//            for (int i = 0; i <arr1.length; i++){
//                if (arr1[i] != arr2[i])
//                    return false;
//            }
//            return true;
//        }
//
//        public static void printArray(int[] arr){
//            if (arr == null){
//                return;
//            }
//            for (int i = 0; i< arr.length; i++){
//                System.out.print(arr[i] + " ");
//            }
//            System.out.println();
//        }
//    public static void main(String[] args) {
//        int testTime =500;
//        int maxSize = 100;
//        int maxValue =100;
//        boolean succeed =true;
//        for (int i= 0; i < testTime; i ++){
//            int[] arr1 = generateRandomArray(maxSize, maxValue);
//            int[] arr2 = copyArray(arr1);
//            if (inversePairs(arr1)!= comparator(arr2)){
//                succeed = false;
//                printArray(arr1);
//                printArray(arr2);
//                break;
//            }
//        }
//        System.out.println(succeed ? "Nice" : "Wrong!");
//
//        int[] arr = generateRandomArray(maxSize, maxValue);
//        System.out.println(inversePairs(arr));
//    }
//}
