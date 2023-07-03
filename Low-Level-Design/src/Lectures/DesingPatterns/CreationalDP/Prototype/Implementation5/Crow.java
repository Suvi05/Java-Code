package Lectures.DesingPatterns.CreationalDP.Prototype.Implementation5;

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
    //Copy Constructor- A CC is a Constructor of the class that takes the parameter of the same class.
    //Clone() is like the client of this CC, where the old value is , the current object of the crow.

    @Override
    public Crow clone() {
        return new Crow(this);//where the old value is, the current object of the crow. //This line is calling CC
    }
}
