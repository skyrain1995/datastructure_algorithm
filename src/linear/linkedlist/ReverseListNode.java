package linear.linkedlist;

/**
 * 反转链表的普通方法实现
 */
public class ReverseListNode {
    public ListNode reverseListNode(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        //前一个节点指针
        ListNode preNode = null;
        //当前节点指针
        ListNode curNode = head;
        //下一个节点指针
        ListNode nextNode = null;

        while (curNode != null){
            nextNode = curNode.next;        //nextNode 指向下一个节点
            curNode.next = preNode;         //将当前节点next域指向前一个节点
            preNode = curNode;              //preNode 指针向后移动
            curNode = nextNode;             //curNode指针向后移动
        }
        return preNode;
    }
}
