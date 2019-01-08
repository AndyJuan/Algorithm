import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.PriorityQueue;

/**
 * 题目描述
 * 如何得到一个数据流中的中位数？如果从数据流中读出奇数个数值，那么中位数就是所有数值排序之后位于中间的数值。如果从数据流中读出偶数个数值，那么中位数就是所有数值排序之后中间两个数的平均值。我们使用Insert()方法读取数据流，使用GetMedian()方法获取当前读取数据的中位数。
 *
 * 解法
 * 利用大根堆存放较小的一半元素，小根堆存放较大的一半元素。维持大小堆的元素个数差不超过 1。
 */
public class code_41_DataStream {
    private PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    private PriorityQueue<Integer> maxHeap = new PriorityQueue<>();

    public void insert(Integer num){
        if (maxHeap.isEmpty() || num <maxHeap.peek()){
            maxHeap.offer(num);
            if (maxHeap.size() - minHeap.size() >1){
                minHeap.offer(maxHeap.poll());
            }
        }else {
            minHeap.offer(num);
            if (minHeap.size() - maxHeap.size() >1){
                maxHeap.offer(minHeap.poll());
            }
        }

    }


    public Double GetMedian(){
        int size1 = maxHeap.size();
        int size2 = minHeap.size();
        if (size1>size2){
            return (double) maxHeap.peek();
        }
        if (size1 < size2){
            return (double) minHeap.peek();
        }
        return (maxHeap.peek() + minHeap.peek()) / 2.0;
    }
}
