package JavaTraining.Multithreading.Masterclass.IntroCode;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi World!, form thread : " + Thread.currentThread().getName());
        //Hi World!, form thread : main

        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
        helloWorldPrinter.run();
        //Hello World! from thread :main

        Thread t = new Thread(helloWorldPrinter);
        t.start();
        //Hello World! from thread :Thread-0

        Thread t1 = new Thread(helloWorldPrinter);
        t1.start();
        //Hello World! from thread :Thread-1

        HelloWorldPrinter helloWorldPrinter1 = new HelloWorldPrinter();
        Thread t2 = new Thread(helloWorldPrinter1);
        t2.start();
        //Hello World! from thread :Thread-2
        System.out.println("Hi Everyone! from Thread :" + Thread.currentThread().getName());
    }
}