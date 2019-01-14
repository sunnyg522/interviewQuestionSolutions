package threads;

/**
 * @project q
 * @authore dgunda on 1/12/19
 */
public class Synchronization {
    private int count =0;
    public synchronized void inc(){
        count++;
    }
    public static void main(String[] args) {
        Synchronization s1 = new Synchronization();
        s1.doWork();
    }
    public void doWork(){
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10000;i++){
                    inc();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10000;i++){
                   inc();
                }
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
        System.out.println(count);
    }
}
