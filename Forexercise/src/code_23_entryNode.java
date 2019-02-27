public class code_23_entryNode {
    public ListNode EntryNodeOfLoop(ListNode pHead){
        if (pHead == null || pHead.next == null )
            return null;
        ListNode fast = pHead;
        ListNode slow = pHead;
        do  {
            fast = fast.next.next;
            slow = slow.next;
        }while ( fast != null && fast!=slow );//如果用while,刚开始fast 和slow是一样的，则不会进入循环
        if (fast != null){ //有相遇节点则开始找入口节点
            fast = pHead;
            while (fast != slow){
                fast = fast.next;
                slow = slow.next;
            }
            return fast;
        }
        return null;
    }
}
