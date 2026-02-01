package JavaTraining.Multithreading.Masterclass.CallableCode;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        RandomNumberGenerator random1 = new RandomNumberGenerator();
        RandomNumberGenerator random2 = new RandomNumberGenerator();

        Future<Integer> r1 = executor.submit(random1);
        Future<Integer> r2 = executor.submit(random2);

        int sum = r1.get() + r2.get();
        System.out.println("Sum of random numbers : " + sum + " From Thread : " + Thread.currentThread().getName());
    }
}
