package LLDProjects.PenDesign.ScalerPenDesign;

import LLDProjects.PenDesign.ScalerPenDesign.Strategies.WriteStrategies.WriteBehaviour;

public class Marker extends Pen implements RefillPen {
    public Marker(WriteBehaviour writeBehaviour) {
        super(PenType.MARKER, writeBehaviour);
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
