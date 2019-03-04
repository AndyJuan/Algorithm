import java.util.LinkedList;
import java.util.Queue;

public class code_41_2_StringFind {
    private int[] cnnt = new int[256];
    private Queue<Character> queue = new LinkedList<>();
    public void Insert(char ch)
    {
        cnnt[ch]++;
        queue.add(ch);
        while (!queue.isEmpty() && cnnt[queue.peek()]>1){
            queue.poll();
        }

    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        return queue.isEmpty() ? '#' : queue.peek();

    }
}
