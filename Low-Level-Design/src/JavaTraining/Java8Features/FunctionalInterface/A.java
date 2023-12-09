package JavaTraining.Java8Features.FunctionalInterface;

@FunctionalInterface
public interface A {
    void myMethod();
    //we can not have 2 abstract methods in interface if we mark it with @FunctionalInterface
    //void myMethod1();

    //Functional Methods can have default methods too along with 1 abstract method
    default void m1() {
        System.out.println("Default method");
    }

    default void m2() {
        System.out.println("Default method");
    }
}
