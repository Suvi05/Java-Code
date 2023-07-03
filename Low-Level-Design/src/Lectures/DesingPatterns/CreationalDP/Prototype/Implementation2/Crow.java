package Lectures.DesingPatterns.CreationalDP.Prototype.Implementation2;

public class Crow extends Bird {
    private String sound = "Kaww";

    //This method will also not work!!
    @Override
    public Crow clone() { //Still not a copy - because parents attributes are not here.
        Crow crow = new Crow();
        crow.sound = this.sound;
        //crow.color=this.color; <- We can't do this, because this is of parent class
        //We could have used setter methods but imagine not all the attributes of parent class have the setter.

        return crow;
    }
}
