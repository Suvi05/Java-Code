package JavaTraining.Polymorphism.RunTime;

public class MacbookAir extends Macbook {
    @Override
    public void start() {
        System.out.println("Inside Macbook Air Start");
    }

    @Override
    public void stop() {
        System.out.println("Inside Macbook Air Stop");
    }
}
