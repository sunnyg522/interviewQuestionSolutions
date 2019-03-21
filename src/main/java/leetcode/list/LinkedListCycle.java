package leetcode.list;

import linkedlist.List;

/**
 * @project q
 * @authore dgunda on 2019-03-19
 */
public class LinkedListCycle {
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
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next== null)
            return false;
        ListNode fp = head;
        ListNode sp = head;
        while (fp!= null && fp.next !=null){
            if(fp == sp)
                return true;
            sp = sp.next;
            fp = fp.next.next;
        }
        return false;
    }
}
