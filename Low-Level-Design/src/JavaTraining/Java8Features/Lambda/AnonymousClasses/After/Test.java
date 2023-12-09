package JavaTraining.Java8Features.Lambda.AnonymousClasses.After;

public class Test {
    public static void main(String[] args) {

        //We implemented run() method here only with Lambda
        Thread t = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Child Thread of Anonymous Class");
            }
        });
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread of with Lambda");
        }
    }
}
/*
Output: Based on Thread Scheduler
---------------------------------
Main Thread of with Lambda
Main Thread of with Lambda
Child Thread of Anonymous Class
Main Thread of with Lambda
Main Thread of with Lambda
Main Thread of with Lambda
Main Thread of with Lambda
Main Thread of with Lambda
Main Thread of with Lambda
Main Thread of with Lambda
Main Thread of with Lambda
Child Thread of Anonymous Class
Child Thread of Anonymous Class
Child Thread of Anonymous Class
Child Thread of Anonymous Class
Child Thread of Anonymous Class
Child Thread of Anonymous Class
Child Thread of Anonymous Class
Child Thread of Anonymous Class
Child Thread of Anonymous Class
 */