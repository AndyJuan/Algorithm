public class code_22_lastKNode {
    public ListNode FindKthToTail(ListNode head,int k){
        if (head == null || k <= 0)
            return null;
        ListNode p1 = head;
        ListNode p2 = head;
        while (--k >0){
            if (p1.next!=null){
                p1=p1.next;
            }else {
                return null;
            }

        }
        while (p1.next!=null){
            p2 = p2.next;
            p1 = p1.next;
        }
        return  p2;
    }
}
