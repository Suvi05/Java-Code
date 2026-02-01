package JavaTraining.Multithreading.Masterclass.IntroCode;

public class HelloWorldPrinter implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello World! from thread :" + Thread.currentThread().getName());
    }
}
