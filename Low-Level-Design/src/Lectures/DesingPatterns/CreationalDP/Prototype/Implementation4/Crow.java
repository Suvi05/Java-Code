package Lectures.DesingPatterns.CreationalDP.Prototype.Implementation4;

public class Crow extends Bird {
    private String sound = "Kaww";

    public void setSound(String sound) {
        this.sound = sound;
    }

    public Crow() {
    }//Default Constructor

    public Crow(Crow old) {//Copy Constructor
        super(old);
        this.sound = old.sound;
    }

    @Override
    public Crow clone() {
        return new Crow(this);
    }
}
