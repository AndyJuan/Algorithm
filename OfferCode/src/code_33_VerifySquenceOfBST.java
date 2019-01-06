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

}
