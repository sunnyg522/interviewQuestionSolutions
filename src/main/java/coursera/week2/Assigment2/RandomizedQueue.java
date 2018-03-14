package coursera.week2.Assigment2;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RandomizedQueue<Item> implements Iterable<Item> {

    private final List<Item> list;

    public RandomizedQueue() {
        list = new ArrayList<Item>();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }

    public void enqueue(Item item) {
        list.add(item);
    }

    public Item dequeue() {
        if (size() == 0)
            throw new NullPointerException("empty random queue");
        int index = getRandomIndex();
        Item item = list.get(index);
        list.remove(index);
        return item;
    }

    private int getRandomIndex() {
        return StdRandom.uniform(list.size());
    }

    public Item sample() {
        return list.get(getRandomIndex());
    }

    public Iterator<Item> iterator() {
        return list.listIterator();
    }

    public static void main(String[] args) {
        RandomizedQueue<String> rq = new RandomizedQueue<String>();
        rq.enqueue("test1");
        rq.enqueue("test2");
        rq.enqueue("test3");
        rq.enqueue("test4");
        rq.enqueue("test5");

        for (String s: rq){
            StdOut.print(s);
        }
    } // this method is not rep
}
