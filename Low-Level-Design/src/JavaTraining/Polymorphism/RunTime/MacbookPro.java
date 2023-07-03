package JavaTraining.Polymorphism.RunTime;

public class MacbookPro extends Macbook {
    @Override
        //Annotation
    void start() {
        System.out.println("Inside Macbook Pro Start");
    }

    @Override
    void stop() {
        System.out.println("Inside Macbook Pro StopMacbookPro");
    }

    void fun() {
        System.out.println("Fun function");
    }
}
