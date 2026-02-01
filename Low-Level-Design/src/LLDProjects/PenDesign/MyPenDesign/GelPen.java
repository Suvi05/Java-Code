package LLDProjects.PenDesign.MyPenDesign;

import LLDProjects.PenDesign.MyPenDesign.Strategy.WritingStrategy;

public class GelPen extends Pen implements Refill {

    public GelPen(WritingStrategy writingStrategy) {
        super(writingStrategy);
    }

    @Override
    void write() {
        System.out.println("Writing with Gel pen");
    }

    @Override
    public void checkRefilStatus() {

    }

    @Override
    public void isRefilCanChange() {

    }

    @Override
    public void changeRefil() {

    }
}
