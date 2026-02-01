package JavaTraining.Multithreading.Masterclass.CallableCode;

import java.util.Random;
import java.util.concurrent.Callable;

public class RandomNumberGenerator implements Callable {
    @Override
    public Integer call() throws Exception {
        Random random = new Random();
        int r1 = random.nextInt();
        System.out.println("Random Number Generated : " + r1 + " From Thread : " + Thread.currentThread().getName());
        return r1;
    }
}
