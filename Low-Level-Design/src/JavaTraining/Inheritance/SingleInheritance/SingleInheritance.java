package JavaTraining.Inheritance.SingleInheritance;

public class SingleInheritance extends java.lang.Object{
    public void  m1(){
        System.out.println("Inside M1 method");
    }

    public static void main(String[] args) {
        SingleInheritance s = new SingleInheritance();
        s.m1();
        s.hashCode();
        System.out.println(s.hashCode());

    }
}
