import java.util.Stack;

/**题目：从后向前打印链表
思路：用栈来暂存， 空间复杂度O(N),时间复杂度O(N)
 递归，每当访问一个节点首先输出后一个节点，链表过长会导致函数调用栈溢出


        由于链表中的内存不是一次性分配的，因而我们无法保证链表的内存
        和数组一样是连续的。因此，如果想在链表中找到它的第i 个节点， 那么我
        们只能从头节点开始， 沿着指向下一个节点的指针遍历链表， 它的时间效
        率为O(n） 。而在数组中，我们可以根据下标在0( 1 ）时间内找到第i 个元素。
*/
class ListNode{
    ListNode next = null;
    int value;
    public void printOut() {
        System.out.println(value);
        ListNode tmp = next;
        while (tmp != null) {
            System.out.println(tmp.value);
            tmp = tmp.next;
        }
    }
}
public class code_06_ListPrint {
    //方法1：使用stack栈的先push后pop
    public static void printListReverse(ListNode listNode){
        Stack<ListNode> stack = new Stack<>();
        while (listNode != null){
            stack.push(listNode);
            listNode = listNode.next;
        }

        while (!stack.isEmpty()){
            System.out.println(stack.pop().value);
        }
    }

    //方法2： 使用递归
    public static void printListReverse2(ListNode listNode){
        if (listNode != null){
            if (listNode.next != null){
                printListReverse(listNode.next);
            }
            System.out.println(listNode.value);
        }
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode();
        ListNode listNode2 = new ListNode();
        ListNode listNode3 = new ListNode();
        listNode1.next=listNode2;
        listNode2.next=listNode3;
        listNode1.value=1;
        listNode2.value=2;
        listNode3.value=3;
        printListReverse(listNode1);
        printListReverse2(listNode1);

    }
}
