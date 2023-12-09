package JavaTraining.Java8Features.Lambda.Multithreading.Before;

//Runnable is a Functional Interface b/c it has only 1 Abstract Method - run()
public class MyRunnableImpl implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread implementation w/o Lambda");
        }
    }
}
