package LLDProjects.SOLID_Principles.DesigningBird;

public class Penguin extends Bird implements Swimmable, Walkable {
    @Override
    public void walk() {
        System.out.println("Penguin runs slowly");
    }

    @Override
    public void swim() {
        System.out.println("Penguin can swim");
    }

    @Override
    void eat() {
        System.out.println("Penguin eats Non-veg");
    }
}
