package LLDProjects.PenDesign;

import LLDProjects.PenDesign.Strategies.WriteStrategies.WriteBehaviour;

public class BallPen extends Pen implements RefillPen {

    public BallPen(WriteBehaviour writeBehaviour) {
        super(PenType.BALL, writeBehaviour);
    }

    @Override
    public void write() {

    }

    @Override
    public Color getColor() {
        return null;
    }

    @Override
    public Refill getRefill() {
        return null;
    }

    @Override
    public boolean canChangeRefill() {
        return false;
    }

    @Override
    public void changeRefill(Refill newRefill) {

    }
}
