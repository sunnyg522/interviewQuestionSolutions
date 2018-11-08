package leetcode;


/**
 * @project q
 * @authore dgunda on 11/6/18
 */
public class MinStack_155 {
    private Node first = null;
    private int minValue = Integer.MAX_VALUE;
    public class Node{
        int item;
        Node next;

        public Node(int item) {
            this.item = item;
        }
    }
    public static void main(String[] args) {
        MinStack_155 minstack = new MinStack_155();
        minstack.push(3);
        minstack.push(5);
        minstack.push(2);
        minstack.push(-1);
        System.out.println(minstack.minValue);
        try {
            minstack.pop();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            System.out.println(minstack.top());
        } catch (Exception e) {
            e.printStackTrace();
        }
        minstack.printStack();
    }
    /** initialize your data structure here. */
    public MinStack_155() {

    }

    public void push(int x) {
        if(first == null) {
            first = new Node(x);
        }else{
            if(x<minValue){
                minValue = x;
                x = 2*x-minValue;
            }
            Node n = new Node(x);
            n.next = first;
            first = n;
        }
    }

    public void pop() throws Exception {
        if(first==null)
            throw new Exception("Stack is empty cannot delete element");
        else {
            Node temp = first.next;
            if (temp.item < minValue)
                minValue  = 2*minValue - temp.item;
            first = first.next;
        }

    }

    public int top() throws Exception {
        if(first == null)
            throw new Exception("No element to return empty stack");
        else
            return first.item<minValue?2*minValue-first.item:first.item;
    }
    public void printStack(){
        Node temp = first;
        while (temp!=null){
            System.out.println(temp.item);
            temp = temp.next;
        }
    }

}
