package leetcode.list;

import linkedlist.List;

/**
 * @project q
 * @authore dgunda on 2019-03-19
 */
public class AddTwoNumbers_2 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }
    public static void main(String[] args) {

    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode p = l1, q = l2 , curr = result;

        int carry =0;
        while (p!=null || q!=null ){
            int a = p==null ? p.val: 0;
            int b = q==null ? q.val: 0;
            int sum = carry+a+b;
            carry = sum/10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if(p!=null) p = p.next;
            if(q!=null) q = q.next;
        }
        if(carry>0){
            curr.next = new ListNode(carry);
        }
        return result.next;
    }
}
