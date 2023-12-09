package JavaTraining.Java8Features.DefaultMethod;

public class B implements A {
    //We can override default method from A or can simply use it here
    @Override
    public void m1() {
        System.out.println("Public method m1() inside Class B");
    }
}
