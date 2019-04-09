import java.util.Scanner;
class ListNode{
    int val;
    ListNode next;
    public ListNode(int val ){
        this.val = val;
    }
}
public class Xiecheng2 {
    public static ListNode reverse(ListNode head , int k){
        ListNode preNode = null;
        ListNode curNode = head;
        ListNode nextNode = null;
        ListNode checkNode = head;
        int flag = 0;
        int cnt = 0;
        while (flag < k && checkNode !=null){
           // System.out.println("1");
            checkNode = checkNode.next;
            flag++;
        }
        if (flag == k){
           // System.out.println("2");
            while (cnt < k && curNode != null){
                nextNode = curNode.next;
                curNode.next = preNode;
                preNode = curNode;
                curNode = nextNode;
                cnt++;
            }
            if (nextNode != null){
                //System.out.println("3");
                head.next = reverse(nextNode,k);
            }
            return preNode;
        }else {
            return head;
        }

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        String str = str1.substring(1, str1.length() - 1);
        int k = Integer.valueOf(str2);
        String[] c = str.split(",");
        int[] num = new int[c.length];
        for (int i = 0; i < c.length ; i++) {
            num[i] = Integer.valueOf(c[i]);
         //  System.out.println(c[i]);
        }
        ListNode head = new ListNode(num[0]);
        ListNode cur = head;
        for (int i = 1; i < c.length; i++){
           cur.next = new ListNode(num[i]);
           cur = cur.next;

        }
        ListNode newList  = reverse(head,k);
        //System.out.println(newList.val);
        ListNode cur2 = newList;
        StringBuffer sss = new StringBuffer();
        sss.append('[');
        while (cur2.next != null){
            sss.append(cur2.val);
            sss.append(',');
            cur2 = cur2.next;
            System.out.println(cur2.val);
        }
        sss.append(cur2.val);
        sss.append(']');
        System.out.println(sss.toString());
    }
}
