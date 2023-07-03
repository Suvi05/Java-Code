package JavaTraining.Abstraction.InterfaceExamples.MultipleInheritance;

import java.io.Serializable;

public class C implements A,B, Serializable {

    @Override
    public void func() {
        System.out.println("This is inside class C");
    }

    public static void main(String[] args) {
        C c=new C();
        c.func();
    }
}
