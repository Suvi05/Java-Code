package JavaTraining.SuperKeyword;

public class B extends A{
    int a=20;

    void show(int a){
        System.out.println(a);     //30   - Test Class
        System.out.println(this.a);     //20   - Same Class -B
        System.out.println(super.a);       //10    - Parent Class - A
    }
}
