package coursera.week2.Assigment2;

import java.util.Iterator;

public class Deque<Item> implements Iterable<Item> {
    private Node first, last;
    private int size;

    private class Node{
        Item item;
        Node next;
        Node previous;
    }
    public Deque(){
        size = 0;
        first = null;
        last = null;
    }
    public boolean isEmpty(){
        return first == last;
    }
    public int size(){
        return size;
    }
    public void addFirst(Item item){
        if(item == null)
            throw new IllegalArgumentException("null argument");
        Node oldFirst = first;
        Node oldLast = last;
        first = new Node();
        first.next = oldFirst;
        first.previous = oldLast;
    }
    public void addLast(Item item){

    }
    public Item removeFirst(){
        Item item = first.item;
        first = first.next;
        return item;
    }
    public Item removeLast(){
        Item item = last.item;
        return item;
    }
    public Iterator<Item> iterator(){
        return new DequeIterator();
    }

    private class DequeIterator implements Iterator<Item>{

        public boolean hasNext() {
            return false;
        }

        public Item next() {
            return null;
        }

        public void remove() {

        }
    }
    public static void main(String[] args){

    } // unit testing (optional)
}