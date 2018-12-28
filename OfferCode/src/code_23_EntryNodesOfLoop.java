/**
 *题目描述：
 * 如果一个链表中包含环，如何找出环的入口节点？
 *
 * 思路：
 *       1.判断是否存在环，并找到快慢两个指针相遇的位置
 *        2.根据找到的这个相遇位置，统计环中节点的数目n，
 *         先让快指针走n步，然后快慢两个指针一起运动，快慢指针相遇时的节点就是环
 *         的入口节点
 *
 */


public class code_23_EntryNodesOfLoop {
    public static ListNode getEntryNode(ListNode head){
        if (head == null){
            return null;
        }

        ListNode meetingNode = meetingNode(head);

        int ringLength = 0;//环的长度

        if (meetingNode!=null){
            ListNode tempNode = meetingNode;
            meetingNode = meetingNode.next;
            while (tempNode != meetingNode){ //此处不是tempNode != meetingNode.next，边界问题要注意
                ringLength++;
                meetingNode = meetingNode.next;
            }
            ringLength++;
        }else {
            return null;
        }

        ListNode first = head;//第一个指针
        ListNode second = head;// 第二个指针；

        while (ringLength>0){
            first = first.next; //第一个指针先在链表上向前移动ringLength步
            ringLength--;
        }

        while (first != second){
            first =first.next;
            second = second.next;
        }
        return first;
    }

    //在链表存在环的情况下，找到一快一慢两个指针相遇的节点
    public static ListNode meetingNode(ListNode head){
        //参数检验
        if (head == null) {
            return null;
        }

        ListNode slow = head.next;

        //如果只有一个节点直接返回null
        if (slow == null){
            return null;
        }

        ListNode fast = slow.next; //快指针第一次移动两步，到了slow的后面

        while(slow !=null && fast != null){
            if(fast == slow){
                return fast;
            }
            slow = slow.next;//慢指针移动一步
            fast = fast.next;//快指针移动两步
            if (fast != null){
                fast = fast.next;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode();
        ListNode temp1 = new ListNode();
        ListNode temp2 = new ListNode();
        ListNode temp3 = new ListNode();
        ListNode temp4 = new ListNode();
        ListNode temp5 = new ListNode();

        head.value=1;
        temp1.value=2;
        temp2.value=3;
        temp3.value=4;
        temp4.value=5;
        temp5.value=6;
        head.next=temp1;
        temp1.next=temp2;
        temp2.next=temp3;
        temp3.next=temp4;
        temp4.next=temp5;
        temp5.next=temp2;

        ListNode resultNode = getEntryNode(head);
        if(resultNode != null){
            System.out.println(resultNode.value);
        }else{
            System.out.println("您输入的参数有误！");
        }

    }
}
