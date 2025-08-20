package collections;

import java.util.concurrent.atomic.AtomicInteger;

/*Write a Java program that creates 10 threads,
where each thread increments a shared counter 100 times each, ensuring the final counter value is 1000.
* */
public class ThreadCount {
   private static final AtomicInteger counter = new AtomicInteger(0);
    public static void main(String[] args) throws Exception{
        //Creat Thread pool
        //provide shared increament to count 100
        //Final count is 10* 100 = 1000

        Thread[] threads = new Thread[5];

       for( int i=0; i < 10; i++) {
           threads[i] = new Thread(()->{
               for(int j =0; j< 100; j++){
                   counter.incrementAndGet();
               }
           });
       }

       for(Thread t: threads){
           t.start(); //Start the thread
       }
       for(Thread t2: threads){
           t2.join(); //join them
       }
        System.out.println("Counter value " + counter.get());
    }
}
