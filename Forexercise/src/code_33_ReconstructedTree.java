
public class code_33_ReconstructedTree {
    public boolean VerifySquenceOfBST(int [] sequence){
        if (sequence == null || sequence.length == 0){
            return false;
        }
        return verify(sequence, 0, sequence.length-1);
    }

    public static boolean verify(int[] sequence, int first, int last){
        if (last - first <= 1) {
            return true;
        }

        int cutIndex = first;
        while (cutIndex <last && sequence[cutIndex] <= sequence[last]){
            cutIndex++;
        }
        for (int i = cutIndex ; i<last;i++){
            if (sequence[i] < sequence[last])
                return false;
        }
        return verify(sequence,first,cutIndex-1) && verify(sequence,cutIndex,last-1);
    }
}
