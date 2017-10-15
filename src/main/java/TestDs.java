import linkedlist.List;

/**
 * Created by dgunda on 9/21/17.
 */
public class TestDs {
    public static void main(String[] args) {
        List list = new List();
        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.addNode(40);
        list.addNode(50);
        list.printList(list.head);
        System.out.println("+++++++++");
        list.remove(50);
        list.printList(list.head);
        System.out.println("+++++++++");
        list.addNode(50);
        list.printList(list.head);
        list.removeNthNodeFromList(list.head, 4);
        System.out.println("++++++++++");
        list.printList(list.head);
        System.out.println("+++++++++++++++");
//        list.printList(list.reverseList(list.head));
        list.addNode(70);
        System.out.println("+++++++++++++++");
        list.printList(list.head);
        System.out.println("+++++++++++++++");
        list.printMiddleOfLinkedList(list.head);
    }
}
