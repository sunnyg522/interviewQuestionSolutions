package threads.LowLevelSync;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

/**
 * @project q
 * @authore dgunda on 1/13/19
 */
public class Process {
    private LinkedList<Integer> list = new LinkedList<>();
    private final int LIMIT = 10;
    private Object lock = new Object();
    public void produce() throws InterruptedException {
        int value = 0;
        while (true){
            synchronized (lock){
                while (list.size()==LIMIT){
                    lock.wait();
                }
                list.add(value);
                System.out.println("Producer added: " + value + " queue size is " + list.size());
                value++;
                lock.notify();
            }
        }
    }
    public void consume() throws InterruptedException{
        Random random = new Random();
        while (true){
            synchronized (lock){
                while (list.size()==0){
                    lock.wait();
                }
                int value = list.removeFirst();
                System.out.print("Removed value by consumer is: " + value);
                System.out.println(" Now list size is: " + list.size());
                lock.notify();
            }
            Thread.sleep(random.nextInt(1000)); //force producer fill the queue to LIMIT_SIZE
        }
    }
}
