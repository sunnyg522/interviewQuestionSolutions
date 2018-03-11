package coursera.week2;

import coursera.week2.Assigment2.RandomizedQueue;
import org.testng.annotations.Test;

public class RandomizedQueueTest {
    @Test
    public void testRandomizedQueues(){
        RandomizedQueue<String> rq = new RandomizedQueue<String>();
        rq.enqueue("test1");
        rq.enqueue("test2");
        rq.enqueue("test3");
        rq.enqueue("test4");
        rq.enqueue("test5");

        for (String s: rq){
            System.out.println(s);
        }
        System.out.println("++++++++++++++");
        System.out.println(rq.dequeue());
        System.out.println(rq.dequeue());
        System.out.println(rq.dequeue());
        System.out.println(rq.dequeue());
        System.out.println(rq.dequeue());

    }
}
