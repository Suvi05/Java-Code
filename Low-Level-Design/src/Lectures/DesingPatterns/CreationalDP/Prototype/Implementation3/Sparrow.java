package Lectures.DesingPatterns.CreationalDP.Prototype.Implementation3;

public class Sparrow extends Bird {
    public Sparrow() {
    } //Default Constructor

    public Sparrow(Sparrow old) {
        super(old);
    }

    @Override
    public Sparrow clone() {
        return new Sparrow(this);
    }
}
