package JavaTraining.SuperKeyword;

public class Child extends Parent{
    void f1(){
        super.f1();
        System.out.println("Inside Child f1"); //100
    }
}
