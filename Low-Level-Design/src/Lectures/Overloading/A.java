package Lectures.Overloading;

public class A {
    //Method Overloading is Compile time polymorphism
    //Method overloading happens when there are 2 or more methods with same name but different signatures.
    //Return type doesn't play role in deciding overloading, as Return type is not a part of Method Signature
    //Method overloading doesn't happen if the only difference is return type.

    public void print() {
        System.out.println("Hello World");
    }

    public void print(String name) {
        System.out.println("Hello " + name);
    }

//    public String print(String name) {
//        System.out.println("Hello from String return type");
//    }
}
