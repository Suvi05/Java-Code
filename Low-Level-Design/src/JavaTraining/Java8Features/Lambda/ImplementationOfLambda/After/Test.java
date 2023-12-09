package JavaTraining.Java8Features.Lambda.ImplementationOfLambda.After;

public class Test {
    public static void main(String[] args) {
        //() nothing in this because in A also doesn't have any parameters
        //i.e. void myMethod() <-- Interface A
        A a = () -> System.out.println("Inside class Test");
        //Here Lambda method directly implemented the method of Interface A
        a.myMethod();
        //We directly invoked the method using reference of interface A without any new object
    }
}
