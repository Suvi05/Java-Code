package LLDProjects.PenDesign;

public interface RefillPen {

    Refill getRefill();

    boolean canChangeRefill();

    void changeRefill(Refill newRefill);
}
//It is OKAY to have any noun as an Interface in place of Class if that Noun does not have any attribute.
//Means if only behaviours/methods are there then we can make interface of that noun instead of a class.