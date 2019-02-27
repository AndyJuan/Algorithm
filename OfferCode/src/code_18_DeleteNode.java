/**
 * 面试题18 删除链表的节点
 * 描述：在O(1)时间内删除链表节点
 * 思路：不直接删除，通过赋值完成。在删除的节点无下一个节点时，则需要从前向后遍历。在删除的节点是头节点时，直接写root = null是无效的，可以考虑写个链表类，包含删除节点的函数。
 * 考点：链表具有单方向遍历的性质，但在操作时也要注意技巧。同时要全面考虑。
 */
class ListOfNode {
    ListOfNode next;
    int data;
    public ListOfNode(int data, ListOfNode next){
        this.data = data;
        this.next = next;
    }


}

public class code_18_DeleteNode {
    public static void deleteNode(ListOfNode head, ListOfNode toBeDeleted){
    if (head == null || toBeDeleted == null)
        return;
    if (toBeDeleted.next != null){
        ListOfNode node = toBeDeleted.next;
        toBeDeleted.data = node.data;
        toBeDeleted.next = node.next;
    }else {
        if (toBeDeleted == head){
            head = null;
            return;
        }else {
            ListOfNode cur = head;
            while (cur.next!=toBeDeleted){
                cur=cur.next;
            }
            cur.next=null;
        }
    }

    }
    // 测试
    public static void main(String[] args) {
      ListOfNode tail = new ListOfNode(1,null);
      ListOfNode c = new ListOfNode(2,tail);
      ListOfNode d = new ListOfNode(3,c);
      ListOfNode head = new ListOfNode(4,d);
//     ListOfNode temp = head;
//      while (temp != null){
//          System.out.println(temp.data);
//          temp=temp.next;
//      }

        deleteNode(head,c );
        System.out.println("==== after delete ====");
        while (head != null){
            System.out.println(head.data);
            head=head.next;
        }


    }

}
