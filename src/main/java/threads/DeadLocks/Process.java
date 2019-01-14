package threads.DeadLocks;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @project q
 * @authore dgunda on 1/13/19
 */
public class Process {
    private Account acc1 = new Account();
    private Account acc2 = new Account();

    private Lock lock1 = new ReentrantLock();
    private Lock lock2 = new ReentrantLock();


    private void accquireLock(Lock lock1, Lock lock2){
        while (true){
            boolean gotFristLock = false;
            boolean gotSecountLock = false;
            try {
                gotFristLock = lock1.tryLock();
                gotSecountLock = lock2.tryLock();
            }finally {
                if(gotFristLock && gotSecountLock)
                    return;
                else if(gotFristLock)
                    lock1.unlock();
                else if(gotSecountLock)
                    lock2.unlock();
            }
        }
    }

    public void firstThread() throws InterruptedException{
        Random random = new Random();
        accquireLock(lock1,lock2);
        try {
            for (int i=0;i<10000;i++){
                Account.transfer(acc1,acc2, random.nextInt(100) );
            }
        }finally {
            lock1.unlock();
            lock2.unlock();
        }

    }

    public void secountThread() throws InterruptedException{
        Random random= new Random();
        accquireLock(lock2,lock1);
        try {
            for (int i=0;i<10000;i++){
                Account.transfer(acc1,acc2, random.nextInt(100) );
            }
        }finally {
            lock1.unlock();
            lock2.unlock();
        }
    }

    public void fineshed() throws InterruptedException{
        System.out.println("Account 1 balance: " + acc1.balance());
        System.out.println("Account 2 balance: " + acc2.balance());
        System.out.println("Total balance: " + (acc1.balance() + acc2.balance()));
    }
}
