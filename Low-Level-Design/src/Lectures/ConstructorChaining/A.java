package Lectures.ConstructorChaining;

public class A {
    private int a;
    private int b;

    A() {
        System.out.println("Constructor of A with no Arguments");
        this.a = 1;
        this.b = 2;
    }

    A(String name) {
        System.out.println("Constructor of A " + name);
    }
}
