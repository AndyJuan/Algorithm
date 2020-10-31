import javax.swing.*;

class ListNode{
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val)
    {
        this.val = val;
    }
    ListNode(int val, ListNode listNode)
    {
        this.val = val;
        this.next=listNode;
    }



}

public class CODE_2_AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(1);
        for (int i =0; i<5;i++){
            l1.next=new ListNode(i);
            l2.next=new ListNode(i);
        }

       ListNode l3 = addTwoNumers(l1,l2);
        while (l3.next != null) {
            System.out.println(l3.val);
            l3=l3.next;
        }
    }

    public static ListNode addTwoNumers(ListNode l1, ListNode l2)
    {
        ListNode head = null, tail = null;
        int flag = 0;
        int temp=0;
        while ((l1!=null || l2!=null)){
            ListNode l3 = new ListNode();
            if (l1 != null && l2!=null){
                temp=l1.val+l2.val+flag;
            }else if (l2 != null){
                temp = l2.val+flag;
            }else {
                temp  = l1.val+flag;
            }

            if (temp>=10){
                l3.val = temp%10;
                flag =temp/10;
            }else {
                flag =0;
                l3.val=temp;
            }

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }

            // 下面写法会有问题，gc
//            if (l1.next != null) {
//                l1 = l1.next;
//            }
//            if (l2.next != null) {
//                l2 = l2.next;
//            }

            if (head == null){

                head = l3;
                tail = l3;

            }else {
                tail.next = l3;
                tail = tail.next;
            }

        }
        // 如果最后一位有进位，需要作为最后一个结点加进去
        if (flag !=0){
            tail.next = new ListNode(flag);
        }

        return head;
    }

    public static ListNode addTwoNumers_gf(ListNode l1, ListNode l2){
        ListNode head = null, tail = null;

        int carry = 0;
        int sum = 0;
        while (l1 != null || l2 != null) {
           int  n1= l1 !=null ? l1.val : 0;
            int n2= l2 !=null ? l2.val : 0;
            sum = n1 +n2 +carry;
            carry = sum/10;

            if (l1 != null) {
                l1 = l1.next;
            }

            if (l2 != null) {
                l2 = l2.next;
            }

            if (head == null) {
                head = tail = new ListNode(sum%10);
            }else {
                tail = new ListNode(sum%10);
                tail = tail.next;
            }
        }

        if (carry > 0) {
            tail.next= new ListNode(carry);
        }

        return head;
    }
}
