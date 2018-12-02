package leetcode;

import linkedlist.List;

/**
 * @project q
 * @authore dgunda on 11/9/18
 */
public class ReverseAlinkedList_206 {
    public static void main(String[] args) {
        List ls = new List();
        ls.addNode(10);
        ls.addNode(5);
        ls.addNode(6);
        ls.addNode(7);
        ls.addNode(9);
    }

    public List.Node reverse(List list){
        List.Node prev = null;
        List.Node current = list.head;
        while (current != null){
            List.Node nextTemp = current.next;
            current.next = prev;
            prev = current;
            current = nextTemp;
        }
        return prev;
    }
}
