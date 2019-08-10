public class code_83_deleteDuplicates {
    public static ListNode deleteDuplicates(ListNode head){
        if (head == null)
            return null;
        ListNode list = head;


        ListNode next = list.next;
        while (list.next!=null){//考虑问题总是不全面，空指针问题没有考虑清楚
             while ( next.val == list.val){
                 if (next.next!=null )
                     next = next.next;
                 else
                     next=null;
                     list.next=null;
                     return head;
             }
             list.next=next;
             list=next;
             next=list.next;
        }
        return head;
    }
    public static ListNode f2_official(ListNode head)
    {//官方解答很简洁明了，比自己的简洁，没有那么累赘
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.next.val == current.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }


}
