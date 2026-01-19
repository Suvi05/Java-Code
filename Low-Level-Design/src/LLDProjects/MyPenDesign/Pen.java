package LLDProjects.MyPenDesign;

import LLDProjects.MyPenDesign.Strategy.WritingStrategy;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class Pen {
    private String brand;
    private int cost;

    private Type type;

    private WritingStrategy writingStrategy;

    public Pen(WritingStrategy writingStrategy) {
        this.writingStrategy = writingStrategy;
    }

    void write() {
        writingStrategy.write();
    }
}
