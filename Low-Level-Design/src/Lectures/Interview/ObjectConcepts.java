package Lectures.Interview;
abstract class Test{
    abstract void m1();
}
public class ObjectConcepts {
    public static void main(String[] args) {
        Test t=new Test() {
            @Override
            void m1() {
                System.out.println("Test");
            }
        };
        t.m1();
    }
}