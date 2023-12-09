package JavaTraining.Java8Features.Lambda.AnonymousClasses.Before;

public class Test {
    public static void main(String[] args) {

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Child Thread of Anonymous Class");
                }
            }
        });
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread of w/o Lambda");
        }
    }
}
/*
Output: Based on Thread Scheduler
---------------------------------
Child Thread of Anonymous Class
Child Thread of Anonymous Class
Child Thread of Anonymous Class
Main Thread of w/o Lambda
Main Thread of w/o Lambda
Main Thread of w/o Lambda
Main Thread of w/o Lambda
Main Thread of w/o Lambda
Main Thread of w/o Lambda
Main Thread of w/o Lambda
Main Thread of w/o Lambda
Main Thread of w/o Lambda
Main Thread of w/o Lambda
Child Thread of Anonymous Class
Child Thread of Anonymous Class
Child Thread of Anonymous Class
Child Thread of Anonymous Class
Child Thread of Anonymous Class
Child Thread of Anonymous Class
Child Thread of Anonymous Class
 */