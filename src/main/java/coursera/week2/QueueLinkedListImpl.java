package coursera.week2;

import java.util.Iterator;

public class QueueLinkedListImpl<T> implements Iterable<T>{

    private Node first, last ;

    public Iterator<T> iterator() {
        return new QueueIterator();
    }

    private class QueueIterator implements Iterator<T>{
        private Node current = first;

        public boolean hasNext() {
            return current != null;
        }

        public T next() {
            T t = current.value;
            current = current.next;
            return t;
        }

        public void remove() {
            throw new UnsupportedOperationException("Remove is not supported");
        }

    }

    private class Node{
        T value;
        Node next;
    }

    public void enQueue(T value){
        Node oldLast = last;
        last = new Node();
        last.value = value;
        last.next = null;
        if(isEmpty())
            first = last;
        else
            oldLast.next = last;
    }

    public T deQueue(){
        T value = first.value;
        first = first.next;
        if(isEmpty())
            last = null;
        if(value == null)
            throw new NullPointerException("queue is empty");
        else
            return value;
    }

    public boolean isEmpty(){
        return first == null;
    }

}
