package LLDProjects.PenDesign.ScalerPenDesign;

import LLDProjects.PenDesign.ScalerPenDesign.Strategies.WriteStrategies.WriteBehaviour;

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
