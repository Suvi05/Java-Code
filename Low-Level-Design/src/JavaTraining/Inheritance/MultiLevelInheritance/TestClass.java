package JavaTraining.Inheritance.MultiLevelInheritance;

public class TestClass {
    public static void main(String[] args) {
        Child c=new Child();
        c.f1(); //Parent
        c.f2(); //Child
        c.hashCode();
        System.out.println(c.hashCode());
    }
}
