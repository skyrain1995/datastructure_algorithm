package linear.linkedlist;

/**
 * 链表中环的检测，如果存在环，找到环的起始结点
 * 快慢指针实现
 */
public class DetectLoop {
    public ListNode detectLoop(ListNode head){
        if(head == null || head.next == null){
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;

        fast = fast.next.next;
        slow = slow.next;
        while(fast != slow){
            if(fast == null){
                System.out.println("该链表无环");
                return null;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        System.out.println("该链表有环");
        ListNode newSlow = head;
        while(newSlow != slow){
            newSlow = newSlow.next;
            slow = slow.next;
        }
        System.out.println("环的起始点的值为："+slow.val);
        return slow;
    }
}
