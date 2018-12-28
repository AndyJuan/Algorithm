/**
 * 描述：输入链表的头结点，反转链表并输出反转后链表的头节点。
 * 思路：要定义pre和next变量存储断开前后的节点。
 * 考点：对链表的理解。
 * 分析：
 * 要想反转链表，对于结点i，我们要把它的next指向它的前趋，因此我们需要保存前趋结点，同时，如果我们已经把i的next重新赋值，会无法找到i的后继，
 * 因此，在重新赋值之前，我们要保存i的后继。
 */

public class code_24_ReverseLis {
    //用两个节点保存的方法
    public static ListNode reverseList (ListNode head){
        //如果链表为空，则返回空
        if (head == null){
            return null;
        }
        //如果链表只有一个节点，也直接返回这一个节点
        if (head.next == null){
            return head;
        }

        //定义反转后链表的头结点
        ListNode reHead = null;
        //当前节点
        ListNode curNode = head;

        while (curNode != null) {
            ListNode nextNode = curNode.next; //记录当前节点的下一节点
            curNode.next = reHead;
            reHead = curNode;
            curNode = nextNode;

        }
       return reHead;
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
        ListNode temp1 = new ListNode();
        ListNode temp2 = new ListNode();
        ListNode temp3 = new ListNode();
        ListNode temp4 = new ListNode();
        ListNode temp5 = new ListNode();

        head.value = 1;
        temp1.value = 2;
        temp2.value = 3;
        temp3.value = 4;
        temp4.value = 5;
        temp5.value = 6;
        head.next = temp1;
        temp1.next = temp2;
        temp2.next = temp3;
        temp3.next = temp4;
        temp4.next = temp5;
        temp5.next = null;

        System.out.println("反转前：");
        printList(head);
        System.out.println();
        System.out.println("反转后：");
        //执行反转操作
        printList(reverseList(head));
        System.out.println();

        System.out.println("只有1个节点的链表反转：");
        ListNode head1 = new ListNode();
        head1.value = 2;
        head1.next = null;
        printList(reverseList(head1));
        System.out.println();

        System.out.println("空节点的链表反转：");
        printList(reverseList(null));



    }
}
