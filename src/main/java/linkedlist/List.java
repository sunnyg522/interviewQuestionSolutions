package linkedlist;

/**
 * Created by dgunda on 9/21/17.
 */
public class List {
    public static Node head;
    public class Node{
        public int data;
        public Node next;
        public boolean isVisisted = false;

    }
    public void addNode(int data){
        if(head == null) {
            head = new Node();
            head.data = data;
            head.next = null;
        }else {
            Node n = new Node();
            n.data = data;
            n.next = head;
            head = n;
        }
    }
    public void printList(Node head){
        Node it = head;
        while (it != null){
            System.out.println(it.data);
            it = it.next;
        }
    }
    public void remove(int node){
        if(head == null){
            return;
        }
        Node curr = head.next;
        Node previous = head;
        if(head.data== node){
            head = head.next;
            return;
        }
        while (curr != null){
            if( curr.data == node) {
                previous.next = curr.next;
                curr = curr.next;
            }else {
                curr = curr.next;
                previous = previous.next;
            }
        }
    }
    public Node reverseList(Node head){
        //1->2->3->4
        Node curr = head;
        Node prev = null;
        Node next = null;
        while (curr !=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return curr;
    }
    public void removeNthNodeFromList(Node head, int n){
        Node first = head;
        Node sec = head;
        for(int i = 0; i<=n; i++){
            first = first.next;
        }
        while (first != null){
            first = first.next;
            sec = sec.next;
        }
        sec.next = sec.next.next;
        return;
    }

    public void printMiddleOfLinkedList(Node head){
        Node slow = head;
        Node fast = head;
        if(head == null){
            return;
        }else if(slow.next == null){
            System.out.println(slow.data);
        }
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
    }

    public boolean detectCyclicLinkedList(Node head){
        Node slow = head;
        Node fast = head;
        if(slow == null){
            return false;
        }
        while(fast != null && slow != null && fast.next != null){
            slow = slow.next;
            fast = fast.next;
            if(slow == fast)
                return true;
        }
        return false;
    }

    public boolean isLinkedListCyclic(Node head){
        Node n = head;
        while (n!=null){
            if(!n.isVisisted){
                n.isVisisted = true;
                n = n.next;
            }else
                return true;
        }
        return false;
    }
}
