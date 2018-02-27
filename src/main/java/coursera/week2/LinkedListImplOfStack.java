package coursera.week2;

public class LinkedListImplOfStack<T> {
    private Node first = null;
    private class Node{
        T value;
        Node next;
    }

    public T pop(){
        if(first == null)
            throw new NullPointerException("stack underflown");
        else {
            T val = first.value;
            first = first.next;
            return val;
        }
    }

    public void push(T value){
            Node oldFirst = first;
            first = new Node();
            first.value = value;
            first.next = oldFirst;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public T peek(){
        if(first.value !=null)
            return first.value;
        else
            throw new IllegalArgumentException("empty linked list");
    }

}
