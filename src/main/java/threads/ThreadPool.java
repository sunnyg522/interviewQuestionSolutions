package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @project q
 * @authore dgunda on 1/13/19
 */

class Process implements Runnable{
    int id;
    public Process(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Starting thread: "+id);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Completing Thread: "+id);
    }
}
public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);
        for (int i=0;i<5;i++){
            service.submit(new Process(i));
        }
        service.shutdown();
        System.out.println("Submitted all tasks");
        try {
            service.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Completed all tasks");
    }
}
