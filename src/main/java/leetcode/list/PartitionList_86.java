package leetcode.list;

/**
 * @project q
 * @authore dgunda on 2019-03-20
 */
public class PartitionList_86 {
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
    public ListNode partition(ListNode head, int x) {
        ListNode beforeHead = new ListNode(0);
        ListNode before = beforeHead;
        ListNode afterHead = new ListNode(0);
        ListNode after =afterHead;

        while (head!=null){
            if(head.val<x){
                before.next = head;
                before = before.next;
            }else {
                after.next = head;
                after = after.next;
            }
            head = head.next;
        }
        after.next = null;

        before.next = afterHead.next;
        return beforeHead.next;
    }
}
