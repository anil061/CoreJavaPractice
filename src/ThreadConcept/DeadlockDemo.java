package ThreadConcept;

public class DeadlockDemo {
    public static void main(String[] args) {
        final Object lock1 = new Object();
        final Object lock2 = new Object();
        Thread t1 = new Thread(()->{
            synchronized (lock1){
                System.out.println("Thread holding lock1");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock2){
                    System.out.println("Thread holding lock1 and lock 2 ");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Thread2: Holding lock2...");
                try { Thread.sleep(100);} catch (Exception e) {}
                synchronized (lock1) {
                    System.out.println("Thread2: Holding lock2 & lock1");
                }
            }
        });
        t1.start(); t2.start();
    }
}
