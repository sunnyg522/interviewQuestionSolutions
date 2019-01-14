package threads.reEntrantLock;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @project q
 * @authore dgunda on 1/13/19
 */
public class Process {

    private int count = 0;
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void increament() {
        for(int i=0;i<10000;i++){
            count++;
        }
    }
    public void firstThread() throws InterruptedException{
        lock.lock();

        System.out.println("waiting...");
        condition.await();
        System.out.println("woken up...");
        try {
            increament();
        }finally {
            lock.unlock();
        }
    }
    public void secoundThread() throws InterruptedException{
        Thread.sleep(1000);
        lock.lock();
        System.out.println("Press the return key!");
        new Scanner(System.in).nextLine();
        System.out.println("Got return key!");
        condition.signal();

        try {
            increament();
        }finally {
            lock.unlock();
        }
    }
    public void finish(){
        System.out.println("Count is: "+count);
    }
}
