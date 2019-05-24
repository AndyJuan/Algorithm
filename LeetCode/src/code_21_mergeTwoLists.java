
public class code_21_mergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null){
            return l1 == null ? l2 :l1;
        }
        ListNode newHead=new ListNode(0);
        ListNode cur = newHead;
        while (l1!=null && l2!= null){
                if (l1.val < l2.val){
                    cur.next = l1;
                    l1 = l1.next;
                }else{
                    cur.next = l2;
                    l2= l2.next;
                }
                cur = cur.next;
        }
        if (l1 ==null){
            cur.next = l2;
        }else if (l2 ==null){
            cur.next = l1;
        }
       return newHead.next;
    }
}
