package coursera.week2;

import java.util.Iterator;

public class LinkedListImplOfStack<T> implements Iterable<T> {
    private Node first = null;

    public Iterator<T> iterator() {
        return null;
    }

    private class stackItrator implements Iterator<T>{

        private Node current = first;

        public boolean hasNext() {
            return current.next != null;
        }

        public T next() {
            T t = current.value;
            current = current.next;
            return t;
        }

        public void remove() {
            throw new UnsupportedOperationException("this operation is not supported");
        }
    }

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
