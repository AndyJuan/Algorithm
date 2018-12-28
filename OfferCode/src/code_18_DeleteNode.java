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
//       //要删除的节点是头结点
//        if (root.equals(toBeDeleted)){
//            root= null;
//            return;
//        }
//        //删除的普通节点
//        ListOfNode temp = toBeDeleted.next;
//        if (temp!=null){
//            toBeDeleted.data= temp.data;
//            if (temp.next != null){
//                toBeDeleted.next = temp.next;
//            }
//            //temp= null;
//        }else {//删除的是最后节点
//            temp = root;
//            while (!temp.next.equals(toBeDeleted)){
//                temp = temp.next;
//            }
//            temp.next = null;
//        }
        //参数校验
        if(head == null || toBeDeleted == null){
            return ;
        }

        //链表中只有一个节点，那么待删除的节点既是头结点，又是尾结点
        if(head == toBeDeleted && head.next == null){
            head = null;
        }else{
            //待删除的节点是尾节点
            if(toBeDeleted.next == null){
                ListOfNode temp = head;
                while(temp.next != toBeDeleted){
                    temp = temp.next;
                }
                temp.next = null;
            }else if(toBeDeleted.next!=null){          //待删除的节点不是尾节点
                toBeDeleted.data = toBeDeleted.next.data;
                toBeDeleted.next = toBeDeleted.next.next;
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

        deleteNode(head,null );
        System.out.println("==== after delete ====");
        while (head != null){
            System.out.println(head.data);
            head=head.next;
        }


    }

}
