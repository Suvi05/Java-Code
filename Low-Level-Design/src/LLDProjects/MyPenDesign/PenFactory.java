package LLDProjects.MyPenDesign;

import LLDProjects.MyPenDesign.Strategy.RoughWriting;
import LLDProjects.MyPenDesign.Strategy.SmoothWriting;
import LLDProjects.MyPenDesign.Strategy.WritingStrategy;

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
