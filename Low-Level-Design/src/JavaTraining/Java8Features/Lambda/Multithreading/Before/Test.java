package JavaTraining.Java8Features.Lambda.Multithreading.Before;

public class Test {
    public static void main(String[] args) {
        //MyRunnableImpl -> which we have created
        Runnable r = new MyRunnableImpl();
        Thread t = new Thread(r);
        t.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread of w/o Lambda");
        }
    }
}
/*
Output: Depends on Thread Scheduler
Main Thread of w/o Lambda
Child Thread implementation w/o Lambda
Child Thread implementation w/o Lambda
Child Thread implementation w/o Lambda
Child Thread implementation w/o Lambda
Child Thread implementation w/o Lambda
Child Thread implementation w/o Lambda
Child Thread implementation w/o Lambda
Child Thread implementation w/o Lambda
Child Thread implementation w/o Lambda
Main Thread of w/o Lambda
Main Thread of w/o Lambda
Main Thread of w/o Lambda
Main Thread of w/o Lambda
Main Thread of w/o Lambda
Main Thread of w/o Lambda
Main Thread of w/o Lambda
Main Thread of w/o Lambda
Child Thread implementation w/o Lambda
Main Thread of w/o Lambda
 */