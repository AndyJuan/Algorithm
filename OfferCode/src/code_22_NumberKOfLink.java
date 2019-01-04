/**
 * 题目描述：
 * 输入一个链表，输出该链表中倒数第k个结点。为了符合大多数人的习惯，本题从1开始计数，即链表的尾结点是倒数第1个结点。
 * 例如一个链表有6个结点，从头结点开始它们的值依次是1，2，3，4，5，6。这个链表的倒数第3个结点是值为4的结点。
 * 思路：无法判断链表大小是主要难点，因此额外定义一个变量，当链表大小大于等于k时进行跟踪。
 * 考点：对鲁棒性的考虑；小心处理程序，可避免原文中提到的程序崩溃问题。
 */


public class code_22_NumberKOfLink {
    public static ListNode findKthToTail(ListNode listHead, int k){
        //参数校验(判断链表是否存在、k是否大于0)
        if (listHead == null || k <= 0 ){
            return null;
        }
        ListNode ahead = listHead; //前面先走k步的指针
        for (int i =1; i <=k; i++){
            if (ahead.next != null){
                ahead= ahead.next;
            }else {
                return null; //链表的长度小于k
            }
        }
        ListNode behined = listHead; //第二个一起走的指针
        while (ahead.next != null){
            ahead = ahead.next;
            behined = behined.next;
        }
        return behined;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode();
        ListNode temp1 = new ListNode();
        ListNode temp2 = new ListNode();
        ListNode temp3 = new ListNode();
        ListNode temp4 = new ListNode();
        ListNode temp5 = new ListNode();
        ListNode temp6 = new ListNode();

        head.value =0;
        temp1.value = 1;
        temp2.value = 2;
        temp3.value = 3;
        temp4.value = 4;
        temp6.value = 6;
        temp5.value = 5;

        head.next=temp1;
        temp1.next=temp2;
        temp2.next=temp3;
        temp3.next=temp4;
        temp4.next=temp5;
        temp5.next=temp6;
        temp6.next=null;

        ListNode resultNode1 = findKthToTail(head, 2);
        if (resultNode1 != null){
            System.out.println(resultNode1.value);
        }else {
            System.out.println("resultNode1 输入的参数有误");
        }

        ListNode resultNode2 = findKthToTail(head, 0);
        if (resultNode2 != null){
            System.out.println(resultNode2.value);
        }else {
            System.out.println("resultNode2 输入的参数有误");
        }

        ListNode resultNode3 = findKthToTail(null, 2);
        if (resultNode3 != null){
            System.out.println(resultNode3.value);
        }else {
            System.out.println("resultNode3 输入的参数有误");
        }

        ListNode resultNode4 = findKthToTail(head, 10);
        if (resultNode4 != null){
            System.out.println(resultNode4.value);
        }else {
            System.out.println("resultNode4 输入的参数有误");
        }

    }
}
