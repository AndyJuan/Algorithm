import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class test {
    public static ListNode reverse(ListNode head) {
        // 参数校验
        if (head == null || head.next == null) {
            return head;
        }

        ListNode secondElem = head.next;
        head.next = null;
        ListNode revHead = reverse(secondElem);
        secondElem.next = head;
        return revHead;
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
        ListNode revHead = reverse(head);
        printList(revHead);
    }

    // 打印列表
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.value + "  ");
            head = head.next;
        }
    }


}
