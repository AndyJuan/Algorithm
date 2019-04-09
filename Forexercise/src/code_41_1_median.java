import java.util.PriorityQueue;

public class code_41_1_median {
    private PriorityQueue<Integer> left  = new PriorityQueue<>((o1, o2) -> o2 - o1);
    private PriorityQueue<Integer> right = new PriorityQueue<>();
    private int N =0;
    public void Insert(Integer num) {
        if (N % 2 == 0){
            left.add(num);
            right.add(left.poll());
        }else {
            right.add(num);
            left.add(right.poll());
        }
        N++;

    }

    public Double GetMedian() {
        if (N % 2 == 0){
            return (left.peek() + right .peek())/2.0;
        }else {
            return (double)right.peek();
        }

    }

    public static void main(String[] args) {
        int[][] arr = {{65,6},{12,1,45,23},{0,-45,1}};//静态创建
        int n = arr[0].length-1;
        for (int[] is : arr) {
            for (int i=0;i< n ;i++) {
                System.out.print(is[i]);
            }
            System.out.println("#");
        }

    }
}
