package LLDProjects.PenDesign;

import java.util.ArrayList;
import java.util.List;

//https://github.com/Naman-Bhalla/pen_jan22/tree/master/src/models
//This one contains fewer requirements but completely running code.
public class Client {
    public static void main(String[] args) {
        List<Pen> pens = new ArrayList<>();
     for (Pen pen : pens) {
            if (pen.getType().equals(PenType.GEL)) {
                //Then do this
                //Instead of writing - if(pen instanceOf GelPen) thing
            }
        }
        System.out.println("Working Fine!");
        GelPen gelPen = PenFactory //Factory and Builder working Together.
                .createGelPen()
                .setCanChangeRefill(true)
                .setRefill(new Refill())
                .build();

        GelPen TrimaxPen = PenFactory
                .createGelPen()
                .setCanChangeRefill(true)
                .setRefill(new Refill())
                .build();
        TrimaxPen.setName("Trimax");
        TrimaxPen.setCompany("Reynolds");

        //And after this we can put this pen into registry for the future.
        //So that in future we don't need to create it from scratch, and we can use it from here.

    }
}
