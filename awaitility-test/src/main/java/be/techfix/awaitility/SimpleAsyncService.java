package be.techfix.awaitility;

import static java.lang.Thread.sleep;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;

public class SimpleAsyncService {

    private Executor executor = Executors.newFixedThreadPool(5);
    private AtomicLong counter = new AtomicLong(0);
    private volatile boolean isAlive;

    void initialize() {
        executor.execute(() -> {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            isAlive = true;
        });
    }
    void incrementCounter(){
        counter.addAndGet(1);
    }

    public AtomicLong getCounter() {
        return counter;
    }

    public boolean isAlive() {
        return isAlive;
    }
}
