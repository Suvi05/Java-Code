package LLDProjects.PenDesign;

import LLDProjects.PenDesign.Strategies.WriteStrategies.WriteBehaviour;

public class FountainPen extends Pen {
    public FountainPen(WriteBehaviour writeBehaviour) {
        super(PenType.FOUNTAIN, writeBehaviour);
    }

    @Override
    public void write() {

    }

    @Override
    public Color getColor() {
        return null;
    }
}
