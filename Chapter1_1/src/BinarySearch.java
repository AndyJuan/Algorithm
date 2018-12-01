
import java.util.Arrays;
import java.util.Random;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
public class BinarySearch {
    public static int rank(int key, int[] a) {
        //数组必须是有序的
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
            } else if (key > a[mid]) {
                lo = mid + 1;
            } else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        //   int []  whitelist = new int[6];
        int[] whitelist = {76, 32, 13, 43, 3, 88, 8, 66, 666};
        Arrays.sort(whitelist);
        for (int i = 0; i <= whitelist.length; i++) {
            int key = 168;
            if (rank(key, whitelist) < 0) {
                System.out.println(key);
                break;
            }

        }
    }
}
