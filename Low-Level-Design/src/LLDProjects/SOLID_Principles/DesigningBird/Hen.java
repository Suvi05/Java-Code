package LLDProjects.SOLID_Principles.DesigningBird;

public class Hen extends Bird implements Flyable, Walkable {
    @Override
    public void fly() {
        System.out.println("Hen flies lower");
    }

    @Override
    public void walk() {
        System.out.println("Hen runs fastly");
    }

    @Override
    void eat() {
        System.out.println("Hen eats Non veg");
    }
}
