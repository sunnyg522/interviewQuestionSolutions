package leetcode;

import linkedlist.List;

/**
 * @project q
 * @authore dgunda on 11/25/18
 */
public class RemoveNthNodeFromEndOfList_19 {
    public static void main(String[] args) {
        List list = new List();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);
        list.addNode(6);
        list.printList(List.head);
        System.out.println("+++++++++++++++++");
        list.removeNthNodeFromList(List.head, 3);
        list.printList(List.head);
    }
    public static void remoNthNodeFromEnd(List.Node n, int nthElement){
        List.Node n1 = List.head;
        List.Node n2 = List.head;
        int j=nthElement;
        while (j>0){
            n1= n1.next;
        }
        while (n1.next!=null){
            n1 = n1.next;
            n2 = n2.next;
        }
        n2 = n2.next.next;
    }
}
