package JavaTraining.Java8Features.FunctionalInterface;

@FunctionalInterface
public interface B extends A {
    //B can not define any new method if it wants to be Functional Interface
    //void myMethod1();

    //We can have same method from Parent but not new one
    @Override
    void myMethod();
}
