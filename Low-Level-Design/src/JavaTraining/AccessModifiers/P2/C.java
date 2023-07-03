package JavaTraining.AccessModifiers.P2;

import JavaTraining.AccessModifiers.P1.A;

public class C extends A{
    public static void main(String[] args) {

        A aObject =new A();
        C cObject = new C();
        //System.out.println(aObject.a);//Private
        //System.out.println(aObject.b);//Default -> b/c it is of package level
        System.out.println(cObject.c);//Protected
        System.out.println(aObject.d);//Public
        System.out.println(cObject.d);
    }
}
