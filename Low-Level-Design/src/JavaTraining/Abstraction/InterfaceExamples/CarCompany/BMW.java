package JavaTraining.Abstraction.InterfaceExamples.CarCompany;

public class BMW implements Car {

    @Override
    public void start() {
        System.out.println("BMW Car starts with a Button");
    }

    @Override
    public void stop() {
        System.out.println("BMW Car stops with a Button");
    }
}
