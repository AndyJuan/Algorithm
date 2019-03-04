import java.util.ArrayList;
import java.util.PriorityQueue;

public class code_40_topk {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k){
        if(input == null || input.length < k){
            return new ArrayList<>();
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1, o2) -> o2 - o1);
        for (int num : input){
            maxHeap.add(num);
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }
        return new ArrayList<>(maxHeap);
    }
}
