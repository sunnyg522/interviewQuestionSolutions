package coursera.week2;

import coursera.week2.Assigment2.Deque;
import org.testng.annotations.Test;

public class DeQueueTest {

    @Test
    public void testDeQueue(){
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
            System.out.println(s);
        }
        System.out.println("+++++++++++");
        System.out.println(deque.removeLast());
        System.out.println(deque.removeLast());
        System.out.println(deque.removeLast());
        System.out.println(deque.size());
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
        System.out.println(deque.removeFirst());
    }
}
