package JavaTraining.Multithreading.Masterclass.ThreadPoolCode;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
//        for (int i = 1; i <= 100; i++) {
//            NumberPrinter numberPrinter = new NumberPrinter(i);
//            Thread printerThread = new Thread(numberPrinter);
//            printerThread.start();
//        }

        ExecutorService executor = Executors.newFixedThreadPool(20);
        for (int i = 1; i <= 100; i++) {
            NumberPrinter numberPrinter = new NumberPrinter(i);
            executor.submit(numberPrinter);
        }
        long end = System.currentTimeMillis();
        Thread.sleep(5000);
        System.out.println("Time taken: " + (end - start) * 1000);
    }
}
