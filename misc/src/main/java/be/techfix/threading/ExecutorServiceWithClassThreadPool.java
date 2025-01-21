package be.techfix.threading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.Executors.newFixedThreadPool;

public class ExecutorServiceWithClassThreadPool {

    public static String work(int i) throws Exception {

        System.out.println("i am starting to work"+Thread.currentThread().getName());
        Thread.sleep(500);
        return "I am finished with task#"+i;
    }

    public static void main(String[] args) throws Exception{

        ExecutorService executorService = newFixedThreadPool(10);
        List<Future<String>> futures = new ArrayList<>();
        int MAX = 10;
        for(int i = 1; i < MAX; i++){
                var index = i;
            Future<String> submit = executorService.submit(() -> {
                try {
                    return work(index);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            });
            futures.add(submit);

        }


        for(Future<String> future : futures){
            System.out.println(future.get());
        }

                executorService.shutdown();
                executorService.awaitTermination(5, TimeUnit.SECONDS);
    }
}
