package LLDProjects.PenDesign.MyPenDesign;

import LLDProjects.PenDesign.MyPenDesign.Strategy.WritingStrategy;

public class BallPen extends Pen implements Refill {
    public BallPen(WritingStrategy writingStrategy) {
        super(writingStrategy);
    }

    @Override
    void write() {
        System.out.println("Writing with Ball Pen");
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
