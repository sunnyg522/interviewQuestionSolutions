package leetcode.list;

/**
 * @project q
 * @authore dgunda on 2019-03-20
 */
public class RemoveDuplicatesFromSortedList {
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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode p = head;
        while (p!=null || p.next!=null){
            if(p.val == p.next.val){
                p.next = p.next.next;
            }else {
                p = p.next;
            }
        }
        return head;
    }
}
