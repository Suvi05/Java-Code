package JavaTraining.AccessModifiers.P2;

import JavaTraining.AccessModifiers.P1.A;

public class D {
    int d=100;
    public static void main(String[] args) {

        A aObject = new A();
        System.out.println(aObject.d);

        D dObject = new D();
        System.out.println(dObject.d);
    }
}
