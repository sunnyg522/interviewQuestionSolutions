package threads;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @project q
 * @authore dgunda on 1/13/19
 */
public class SyncCodeBlocks {

    private Object lock1 = new Object();
    private Object lock2 = new Object();
    private List<Integer> list1 = new ArrayList<>();
    private List<Integer> list2 = new ArrayList<>();
    private Random random = new Random();

    public void stageOne(){
        synchronized (lock1) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list1.add(random.nextInt(100));
        }
    }
    public void stageTwo(){
        synchronized (lock2) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list2.add(random.nextInt(100));
        }
    }

    public void process(){
        for(int i=0;i<1000;i++){
            stageOne();
            stageTwo();
        }
    }

    public static void main(String[] args) {
        SyncCodeBlocks s = new SyncCodeBlocks();
        System.out.println("Starting ....");
        long start = System.currentTimeMillis();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                s.process();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                s.process();
            }
        });
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("Time take = "+(end - start));
        System.out.println("List1 : "+s.list1.size()+" , List2 : "+s.list2.size());
    }
}
