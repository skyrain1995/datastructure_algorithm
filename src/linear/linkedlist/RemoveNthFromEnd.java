package linear.linkedlist;

/**
 * 删除链表倒数第n个结点
 * 只有两种出现的情况：1.链表长度刚好为n，即删除表头结点
 *                    2.链表长度的>n，定义两个指针，第一个后移n位，然后两个一起后移，
 *                      当第一个到结尾时，第二个即为要删除结点的前一个
 */
public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(int n,ListNode head){
        ListNode l1 = head;         //
        ListNode l2 = head;
        for(int i = 0;i < n;i++){   //第一个指针向后移动n位
            l1 = l1.next;
        }
        if(l1 == null){             //链表长度刚好为n，即删除表头结点
            return head.next;
        }
        while(l1.next != null){
            l1 = l1.next;
            l2 = l2.next;
        }
        //当第一个到结尾时，第二个即为要删除结点的前一个
        l2.next = l2.next.next;
        return head;
    }
}
