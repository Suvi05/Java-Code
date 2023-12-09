package JavaTraining.Java8Features.MethodReferencing.Static;

public class MethodRefDemo {
    //We will map this method to Runnable's run() method
    public static void myMethod() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Child Thread-Method Referencing");
        }
    }

    public static void main(String[] args) {
        //In place of lambda we are using Method Mapping
        //We will express Runnable interface using Method Referencing
        Runnable r = MethodRefDemo::myMethod;
        //Our method is static that's why we are using Class Name
        Thread t = new Thread(r);
        t.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread-Method Referencing");
        }
    }
}
/*
Output: Depends on Thread Scheduler
Main Thread-Method Referencing
Main Thread-Method Referencing
Child Thread-Method Referencing
Child Thread-Method Referencing
Child Thread-Method Referencing
Child Thread-Method Referencing
Child Thread-Method Referencing
Main Thread-Method Referencing
Main Thread-Method Referencing
Main Thread-Method Referencing
 */