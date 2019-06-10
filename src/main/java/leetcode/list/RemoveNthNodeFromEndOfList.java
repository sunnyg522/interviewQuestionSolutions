package leetcode.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @project q
 * @authore dgunda on 2019-03-20
 */
public class RemoveNthNodeFromEndOfList {
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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode fp = head;
        ListNode sp = head;
        for(int i=0;i<n;i++){
            fp = fp.next;
        }
        while (fp !=null){
            fp = fp.next;
            sp = sp.next;
        }
        sp.next = sp.next.next;
        return head;
    }
}
