package LLDProjects.SOLID_Principles.DesigningBird;

public abstract class Bird {
    String name;
    String color;

    abstract void eat();

    void breathe() {
        System.out.println("Breathing Normally");
    }

    String getDescription() {
        return "I'm a bird type";
    }

    @Override
    public String toString() {
        return "Bird{" + "name='" + name + '\'' + ", color='" + color + '\'' + '}';
    }
}
