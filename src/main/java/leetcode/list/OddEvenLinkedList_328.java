package leetcode.list;

/**
 * @project q
 * @authore dgunda on 2019-03-20
 */
public class OddEvenLinkedList_328 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {

    }

    /***
     * Input: 1->2->3->4->5->NULL
     * Output: 1->3->5->2->4->NULL
     * @param head
     * @return
     */
    public ListNode oddEvenList(ListNode head) {
        if(head == null)
            return  head;
        ListNode result = head;
        ListNode p1 = head;
        ListNode p2 = head.next;
        ListNode conntedNode = head.next;
        while (p1.next!=null && p2.next==null){
            ListNode t = p2.next;
            if(t == null)
                break;
            p1.next = p2.next;
            p1 = p1.next;

            p2.next = p1.next;
            p2 = p2.next;
        }
        p1.next = conntedNode;
        return result;
    }
}
