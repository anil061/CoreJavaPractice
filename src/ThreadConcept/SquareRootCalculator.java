package ThreadConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SquareRootCalculator {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int N = 10;
        List<Double> squareRoots = computeSquareRoots(N);
        System.out.println("Square roots from 0 to " + N + ": " + squareRoots);
    }

    private static List<Double> computeSquareRoots(int n) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        List<Double> results = new ArrayList<>(Collections.nCopies(n+1, null));

        List<Future<?>> futures = new ArrayList<>();

        for(int i = 0; i<=n; i++){
              final int num = i;
              Future<?> future = executor.submit(()->{
                  double sqrt = Math.sqrt(num);
                  results.set(num,sqrt);
              });
            futures.add(future);
        }
      for(Future<?> f: futures){
           f.get();
      }
executor.shutdown();
      return results;
    }
}
