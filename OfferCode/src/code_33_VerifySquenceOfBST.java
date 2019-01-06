/**
 * 题目描述
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 *
 * 解法
 * 序列的最后一个元素是二叉搜索树的根节点。
 *
 * 在序列中从左到右找到根节点的左子树(比根节点小)、右子树(比根节点大)。
 *
 * 如果右子树中出现比根节点小的元素，那么为 false。
 * 否则递归左右子树。
 */

public class code_33_VerifySquenceOfBST {
        public boolean verifySequenceOfBST (int[] sequence){
            if (sequence == null || sequence.length <1 ){
                return false;
            }
            return  verify(sequence, 0 , sequence.length - 1);
        }

        private boolean verify(int[] sequence, int start, int end){
            if (start >= end){
                return  true;
            }
            int val = sequence[end];
            int i = start;
            //在二又搜索树中左子树节点的值小于根节点的值
            for (; i <= end ; i ++){
                    if (sequence[i] >= val){
                        break;
                    }
            }

            //在二又搜索树中右子树节点的值大于根节点的值
            for (int j = i ; j <= end ; j ++){
                if (sequence[j] < val){
                    return false;
                }
            }

            return verify(sequence, start, i-1 ) && verify(sequence, i, end-1);
        }
}
