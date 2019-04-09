import java.util.PriorityQueue;

public class code_04_mediaNumber {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((o1, o2) -> o2 - o1);
        for (int i = 0; i < nums1.length ;i++){
            if (i%2==0  ){
                minHeap.add(nums1[i]);
                maxHeap.add(minHeap.poll());
            }else{
                maxHeap.add(nums1[i]);
                minHeap.add(maxHeap.poll());
            }
        }
        for (int i = 0; i < nums2.length ;i++){
            if ((i+nums1.length)%2==0  ){
                minHeap.add(nums2[i]);
                maxHeap.add(minHeap.poll());
            }else{
                maxHeap.add(nums2[i]);
                minHeap.add(maxHeap.poll());
            }
        }
        double res = 0;
        if ((nums1.length + nums2.length) %2 == 0){
            res = (double) (maxHeap.peek() +minHeap.peek())/2;
        }else{
            res = maxHeap.peek();
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = {1};
        int[] nums2 = {1};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
}
