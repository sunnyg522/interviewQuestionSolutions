package leetcode.list;

/**
 * @project q
 * @authore dgunda on 2019-03-19
 */
public class MergeTwoSortedLists_21 {
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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode p = result;
        while (l1!=null || l2 !=null){
            if(l1!=null&&l2!=null){
                if(l1.val<l2.val){
                    p.next = l1;
                    l1 = l1.next;
                }else{
                    p.next = l2;
                    l2 = l2.next;
                }
                p = p.next;
            }else if(l1 == null){
                p.next = l2;
                break;
            }else if (l2 == null){
                p.next = l1;
                break;
            }
        }
        return result.next;
    }
}
