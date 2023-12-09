package JavaTraining.Java8Features.MethodReferencing.NonStatic;

public class MyClass {
    //To map that method first we have to create that
    //Method name can be different but parameters/argument should be same
    public void myMethod1(int i) {
        System.out.println("Method Referencing " + i);
    }

    public static void main(String[] args) {
        //Functional Interface using Lambda Expression
        MyInterface f = i -> System.out.println("Lambda Expression " + i);
        f.myMethod(10);

        //Creating instance b/c method is Non-Static
        MyClass myClass = new MyClass();
        //Mapping myMethod1 with Functional Interface-MyInterface
        MyInterface f1 = myClass::myMethod1;
        f1.myMethod(20);
    }
}
/*
Output:
Lambda Expression 10
Method Referencing 20
 */