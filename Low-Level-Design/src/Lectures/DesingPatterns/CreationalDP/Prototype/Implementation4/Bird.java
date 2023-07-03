package Lectures.DesingPatterns.CreationalDP.Prototype.Implementation4;

public class Bird implements Cloneable<Bird> {

    private String name;
    private String color;
    private int weight;

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Bird() {
    } //Default Constructor for Child Classes

    public Bird(Bird old) { //Copy Constructor
        this.name = old.name;
        this.color = old.color;
        this.weight = old.weight;
    }


    @Override
    public Bird clone() { //Clone() which is just calling the Copy Constructor
        return new Bird(this);
    }
}
