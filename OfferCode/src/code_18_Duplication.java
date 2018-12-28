/**
 * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
 * 例如：
 * 输入链表：1->2->3->3->4->4->5
 * 处理结果：1->2->5
 *
 * 分析：
 * 1、新建一个头节点，以防止第一个节点被删除。
 * 2、保存当前节点的前一个节点，循环遍历整个链表，如果当前节点的值与下一个节点的值相等，则将当前节点的值与next.next节点的值比较，直到不相等或者null为止，最后将当前节点的前一个节点pre指向最后比较不相等的节点。
 * 3、如果当前节点与next节点不相等，则直接让节点指针全部向后移动一位。
 * ---------------------
 * 作者：许文杰
 * 来源：CSDN
 * 原文：https://blog.csdn.net/weixin_37672169/article/details/80163042
 * 版权声明：本文为博主原创文章，转载请附上博文链接！
 */


public class code_18_Duplication {


}