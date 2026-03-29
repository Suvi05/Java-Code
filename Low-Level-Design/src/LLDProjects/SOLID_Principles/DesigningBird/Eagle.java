package LLDProjects.SOLID_Principles.DesigningBird;

public class Eagle extends Bird implements Flyable, Walkable {
    @Override
    public void fly() {
        System.out.println("Eagle flies higher");
    }

    @Override
    public void walk() {
        System.out.println("Eagle runs faster");
    }

    @Override
    void eat() {
        System.out.println("Eagle eats Non veg");
    }
}
