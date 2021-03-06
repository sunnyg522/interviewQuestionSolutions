package coursera.week2.Assigment2;

import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Deque<Item> implements Iterable<Item> {
    private Node first, last;
    private int size;

    private class Node {
        Item item;
        Node next;
        Node previous;
    }

    public Deque() {
        size = 0;
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void addFirst(Item item) {
        if (item == null)
            throw new IllegalArgumentException("null argument");
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        first.previous = null;
        if (oldFirst != null)
            oldFirst.previous = first;
        if (last == null)
            last = first;
        size++;
    }

    public void addLast(Item item) {
        if (item == null)
            throw new IllegalArgumentException("null argument");
        Node oldLast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        last.previous = oldLast;
        if (oldLast != null)
            oldLast.next = last;
        if (first == null)
            first = last;
        size++;
    }

    public Item removeFirst() {
        if (first == null)
            throw new NullPointerException("empty queue");
        Item item = first.item;
        first = first.next;
        if (first != null)
            first.previous = null;
        size--;
        return item;

    }

    public Item removeLast() {
        Item item;
        if (last == null)
            throw new NullPointerException("empty queue");
        item = last.item;
        last = last.previous;
        if (last != null)
            last.next = null;
        size--;
        return item;
    }

    public Iterator<Item> iterator() {
        return new DequeIterator();
    }

    private class DequeIterator implements Iterator<Item> {

        private Node current = first;

        public boolean hasNext() {
            return current != null;
        }

        public Item next() {
            if (current == null)
                throw new NoSuchElementException();
            Item item = current.item;
            current = current.next;
            return item;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static void main(String[] args) {
        Deque<String> deque = new Deque<String>();
        deque.addLast("last");
        deque.addLast("last2");
        deque.addLast("last3");
        deque.addFirst("first");
        deque.addFirst("first1");
        deque.addFirst("first2");
        deque.addFirst("first3");
        System.out.println(deque.size());
        for (String s: deque) {
            StdOut.print(s);
        }
    } // unit testing (optional)
}