package coursera.week2;

import java.util.Iterator;

public class Bag <T> implements Iterable<T>{
    public Iterator<T> iterator() {
        return new BagIterator();
    }

    public class BagIterator implements Iterator<T>{
        private Node current = first;
        public boolean hasNext() {
            return current != null ;
        }

        public T next() {
            T t = current.item;
            current = current.next;
            return t;
        }
        public void remove() {
            throw new UnsupportedOperationException("un supported exception");
        }
    }

    private Node first = null;
    private int size=0;
    private class Node{
        T item;
        Node next;
    }
    public void add(T item){
        size++;
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
    }
    public int size(){
        return size;
    }
}
