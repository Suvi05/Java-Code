package JavaTraining.Java8Features.Lambda.Multithreading.After;

public class Test {
    public static void main(String[] args) {
//        Runnable r = new MyRunnableImpl();
//        Thread t = new Thread(r);
//        t.start();

        //Now no Implementation class is needed after using Lambda
        Runnable r = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Child Thread implementation with Lambda");
            }
        };

        Thread t = new Thread(r);
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread of with Lambda");
        }
    }
}
/*
Output: Depends on Thread Scheduler
Main Thread of with Lambda
Main Thread of with Lambda
Main Thread of with Lambda
Main Thread of with Lambda
Main Thread of with Lambda
Main Thread of with Lambda
Main Thread of with Lambda
Main Thread of with Lambda
Child Thread implementation with Lambda
Child Thread implementation with Lambda
Child Thread implementation with Lambda
Child Thread implementation with Lambda
Child Thread implementation with Lambda
Child Thread implementation with Lambda
Child Thread implementation with Lambda
Child Thread implementation with Lambda
Child Thread implementation with Lambda
Child Thread implementation with Lambda
Main Thread of with Lambda
Main Thread of with Lambda
 */