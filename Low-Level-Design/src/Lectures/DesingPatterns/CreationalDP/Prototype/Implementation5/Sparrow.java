package Lectures.DesingPatterns.CreationalDP.Prototype.Implementation5;

public class Sparrow extends Bird {

    private int lsize;

    public void setLsize(int lsize) {
        this.lsize = lsize;
    }

    public Sparrow() {
    } //Default Constructor

    public Sparrow(Sparrow old) {
        super(old);
        this.lsize = old.lsize;
    }

    @Override
    public Sparrow clone() {
        return new Sparrow(this);
    }
}
