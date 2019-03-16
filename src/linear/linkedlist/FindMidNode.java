package linear.linkedlist;

/**
 * 寻找单链表中间结点（快慢指针）
 */
public class FindMidNode {
    public ListNode findMidNode(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
