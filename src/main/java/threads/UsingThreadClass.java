package threads;

/**
 * @project q
 * @authore dgunda on 1/12/19
 */


class Runner2 extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Test: " +i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class UsingThreadClass {
    public static void main(String[] args) {
        Runner2 run = new Runner2();
        run.start();
    }
}
