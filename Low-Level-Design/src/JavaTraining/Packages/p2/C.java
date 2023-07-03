package JavaTraining.Packages.p2;

import JavaTraining.Packages.p1.*; //Different Package
                                   //* -> To Import all the classes from p1

public class C {
    public static void main(String[] args) {
        A.a1();
        A aObject = new A();
        aObject.a2();
    }
}
