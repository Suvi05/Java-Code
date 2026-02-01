package LLDProjects.PenDesign.MyPenDesign;

import LLDProjects.PenDesign.MyPenDesign.Strategy.RoughWriting;
import LLDProjects.PenDesign.MyPenDesign.Strategy.SmoothWriting;

public class PenFactory {
    static public Pen createPen(Type type) {
        if (type.equals(Type.BALL)) {
            return new BallPen(new RoughWriting());
        } else if (type.equals(Type.GEL)) {
            return new GelPen(new SmoothWriting());
        }
        throw new IllegalArgumentException("Wrong pen type selected");
    }
}
