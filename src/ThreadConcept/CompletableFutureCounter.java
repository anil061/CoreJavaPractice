package ThreadConcept;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CompletableFutureCounter {
    public static void main(String[] args) {
        AtomicInteger counter = new AtomicInteger();
        List<CompletableFuture<Void>> futures = new ArrayList<>();

        for(int i=0; i< 10; i++){
            CompletableFuture future = CompletableFuture.runAsync(()->{
                for(int j =0; j<10; j++){
                    counter.incrementAndGet();
                }
            });
            futures.add(future);
        }
        CompletableFuture.allOf(futures.toArray(new CompletableFuture[0])).join();
        System.out.println("Final Counter Value " + counter.get());
        CompletableFuture.supplyAsync(()-> 10)
                .thenApply(i-> i *2)
                .thenAccept(x-> System.out.println("Result " + x));

        //Combining Futures
        CompletableFuture<Integer> f1 = CompletableFuture.supplyAsync(() -> 10);
        CompletableFuture<Integer> f2 = CompletableFuture.supplyAsync(()-> 20);
        CompletableFuture<Integer> combined = f1.thenCombine(f2, (a,b)-> a + b);
        System.out.println("Combined =====>" + combined.join());

        //Running Multiple Tasks in parallel
        List<CompletableFuture<Integer>> futureList = IntStream.range(1,6)
                .mapToObj(i -> CompletableFuture.supplyAsync(()-> i * 10))
                .collect(Collectors.toList());
        CompletableFuture<Void> all = CompletableFuture.allOf(futureList.toArray(new CompletableFuture[0]));
        all.join();
        futureList.forEach(f-> System.out.println(f.join()));

        // Exception Handling:
        CompletableFuture<Integer> f3 = CompletableFuture.supplyAsync(() -> {
            if(true) throw new RuntimeException("There is a Exception");
            return 1;
        }).exceptionally(ex-> {
            System.out.println("Error ::" + ex.getMessage());
            return 0;
        });
        //Accept input, do async processing, and return final result
        String id= "123";
       // fetechAndTransform(id);

        //Looping or batching async tasks using CompletableFuture
        /*List<String> ids = List.of("1", "2", "3");
        List<CompletableFuture<String>> values = ids.stream()
                .map(id -> CompletableFuture.supplyAsync(() -> process(id)))
                .collect(Collectors.toList());

        List<String> results = values.stream()
                .map(CompletableFuture::join)
                .collect(Collectors.toList());*/

        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try { Thread.sleep(5000); } catch (InterruptedException e) {}
            return "Done";
        });

        String result = future.orTimeout(2, TimeUnit.SECONDS) // Java 9+
                .exceptionally(ex -> "Timeout")
                .join();

        System.out.println(result);

    }

    /*private static void fetechAndTransform(String id) {
        CompletableFuture.supplyAsync(()->fetchFromDB(id))
                .thenApply(data -> transformData(data));
    }
*/
}
