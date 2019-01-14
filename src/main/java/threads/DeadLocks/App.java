package threads.DeadLocks;

/**
 * @project q
 * @authore dgunda on 1/13/19
 */
public class App {
    public static void main(String[] args) throws InterruptedException {
        Process p = new Process();
        Thread t1 = new Thread(()->{
            try {
                p.firstThread();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t2 = new Thread(()->{
            try {
                p.secountThread();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        p.fineshed();
    }
}
