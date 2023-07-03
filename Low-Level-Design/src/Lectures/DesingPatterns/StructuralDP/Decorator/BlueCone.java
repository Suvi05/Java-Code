package Lectures.DesingPatterns.StructuralDP.Decorator;

public class BlueCone implements IceCreamCone {
    @Override
    public int getCost() {
        return 5; //For Blue Cone  price is 5 Rupees
    }

    @Override
    public String getConstituents() {
        return "Blue Cone";
    }//Base Entity and both of them are IceCreamCone
}
