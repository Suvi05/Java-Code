package LLDProjects.SOLID_Principles.DesigningBird;

public class Duck extends Bird implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("Duck flies lower");
    }

    @Override
    public void swim() {
        System.out.println("Duck can swim");
    }

    @Override
    void eat() {
        System.out.println("Duck eats Veg and Non veg both");
    }
}
