package threads;

/**
 * @project q
 * @authore dgunda on 1/12/19
 */
public class UsingThreadClassConstructure {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++){
                    System.out.println("HelloThread: " +i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t1.start();
    }
}
