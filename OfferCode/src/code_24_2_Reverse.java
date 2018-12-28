

public class code_24_2_Reverse {

    //使用递归实现：链表的反转
    public static ListNode reserve (ListNode head) {
        if (head == null || head.next == null){
            return  head;  //递归这里不能返回Null
        }

        ListNode curNext = head.next;
        head.next = null;
        ListNode revHead = reserve(curNext);
        curNext.next = head;
        return revHead;

    }
    //打印列表
    public static void printList(ListNode head){
        while(head != null){
            System.out.print(head.value + "  ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode();
        head.value = 1;
        ListNode node2 = new ListNode();
        node2.value = 2;
        ListNode node3 = new ListNode();
        node3.value = 3;
        ListNode node4 = new ListNode();
        node4.value = 4;
        ListNode node5 = new ListNode();
        node5.value = 5;
        ListNode node6 = new ListNode();
        node6.value = 6;

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        printList(head);
        System.out.println();
        ListNode revHead = reserve(head);
        printList(revHead);
    }

}
