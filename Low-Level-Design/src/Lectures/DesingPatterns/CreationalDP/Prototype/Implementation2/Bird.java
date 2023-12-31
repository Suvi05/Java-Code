package Lectures.DesingPatterns.CreationalDP.Prototype.Implementation2;

public class Bird implements Cloneable<Bird> {

    private String name;
    private String color;
    private int weight;

    //Return type of clone is <Bird> because we are passing <Bird> in Cloneable method as Generic type
    @Override
    public Bird clone() {
        Bird b = new Bird();
        b.name = this.name;
        b.color = this.color;
        b.weight = this.weight;
        return b;
        //This method will only work if your class is the BASE CLASS
        //because otherwise you also have to copy the attributes of the Parent
    }
}
