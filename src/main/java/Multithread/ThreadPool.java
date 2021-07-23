package Multithread;

import java.io.IOException;
import java.util.concurrent.*;

public class ThreadPool {
    public static void main(String[] args) throws InterruptedException {
//        Executor executor = Executors.newSingleThreadExecutor();
//        executor.execute(() -> System.out.println("abc"));

        ExecutorService service = Executors.newFixedThreadPool(2);
        Future<String> future=service.submit(()->"helloworld");

        try {
            String s=future.get();
            System.out.println(s);
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

}
