package Java21;

public class SimpleVirtualThreadExample {
    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            System.out.println("Hello from a virtual thread! Thread name: \" + Thread.currentThread().getName()");
        };
        // Create and start the virtual thread
        Thread virtualThread = Thread.currentThread();
        // The main thread waits for the virtual thread to complete
        virtualThread.join();
        System.out.println("Main thread finishes.");
    }
}
