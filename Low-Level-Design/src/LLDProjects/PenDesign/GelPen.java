package LLDProjects.PenDesign;

import LLDProjects.PenDesign.Strategies.WriteStrategies.SmoothWriteBehaviour;
import LLDProjects.PenDesign.Strategies.WriteStrategies.WriteBehaviour;

public class GelPen extends Pen implements RefillPen {
    private Refill refill;
    private boolean canChangeRefill = false;

    //We are making this constructor private, So that we can only create object through Builder.

    //Code in case of we implement Strategy DP
    private GelPen(WriteBehaviour writeBehaviour) {
        super(PenType.GEL, writeBehaviour);
    }

//    private GelPen() {
//        super(PenType.GEL);
//    }
    public static class Builder {
        private Refill refill;
        private boolean canChangeRefill = false;

        public Builder setRefill(Refill refill) {
            this.refill = refill;
            return this;
        }

        public Builder setCanChangeRefill(boolean value) {
            this.canChangeRefill = value;
            return this;
        }

        public GelPen build() {
            GelPen gelPen = new GelPen(new SmoothWriteBehaviour());
            gelPen.refill = this.refill;
            gelPen.canChangeRefill = this.canChangeRefill;
            return gelPen;
        }
    }

    @Override
    public void write() {

    }

    @Override
    public Color getColor() {
        return null;
    }

    //These changes in the return type is due to the changes in inner class Builder
    @Override
    public Refill getRefill() {
        return this.refill;
    }

    @Override
    public boolean canChangeRefill() {
        return this.canChangeRefill;
    }

    @Override
    public void changeRefill(Refill newRefill) {

    }
}
