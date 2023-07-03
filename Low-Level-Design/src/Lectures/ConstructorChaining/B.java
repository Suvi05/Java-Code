package Lectures.ConstructorChaining;

public class B extends A {
    private int c;

    B() {
        super("Suvi");
        //If we comment this then we will get the SOUT statement from the default constructor of A
        this.c = 3;
        System.out.println("Constructor of B ");
    }
}
