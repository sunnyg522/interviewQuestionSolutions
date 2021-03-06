package linkedlist;

public class List1 {
    public Node head;
   class Node{
       private int value;
       private Node next;

       public Node(int value){
           this.value = value;
       }
   }

   //head->1->null
    //2 adding new node
    //head->2->1->null
   public void add(int value){
       if(head == null){
           head = new Node(value);
           head.next = null;
       }else{
           Node n = new Node(value);
           n.next = head;
           head = n;
       }
   }
   public void printList(){
       Node temp = head;
       while(temp!=null){
           System.out.println(temp.value);
           temp = temp.next;
       }
   }
}
