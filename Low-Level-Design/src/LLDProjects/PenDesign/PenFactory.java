package LLDProjects.PenDesign;
//Builder is build in the class but not the Factory, it is always a new Class
public class PenFactory {

    public static GelPen.Builder createGelPen() {
        return new GelPen.Builder();
    }

    public static BallPen createBallPen() {
        return null;
        //Similar code will go here like we did for GelPen Class
    }
}
