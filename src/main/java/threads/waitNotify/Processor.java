package threads.waitNotify;

import java.util.Scanner;

/**
 * @project q
 * @authore dgunda on 1/13/19
 */
public class Processor {

    public void produce() throws InterruptedException {
        synchronized (this){
            System.out.println("Producer thread running");
            wait();
            System.out.println("Resume");
        }
    }
    public void consume() throws InterruptedException{
        Scanner scanner = new Scanner(System.in);
        Thread.sleep(2000);
        synchronized (this){
            System.out.println("Waiting for return key");
            scanner.nextLine();
            System.out.println("Return key pressed");
            notify();
            Thread.sleep(2000);
            System.out.println("Consumetion done");
        }
    }
}
