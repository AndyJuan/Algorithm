public class code_24_ReserveList {
    public ListNode ReverseList1(ListNode head){
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp = null;
        while (head != null) {
            ListNode p = head.next;
            head.next = temp;
            temp = head;
            head = p;
        }
        return temp;
    }
    public ListNode ReverseList2(ListNode head){
        if (head == null || head.next == null) {
            return head;
        }
        ListNode next = head.next;
        head.next = null;
        ListNode newList = ReverseList2(next);
        next.next = head;
        return newList;
    }
}
