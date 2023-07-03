package Lectures.DesingPatterns.StructuralDP.Decorator;

public class OrangeCone implements IceCreamCone{
    @Override
    public int getCost() {
        return 10;//For Orange Cone  price is 10 Rupees
    }

    @Override
    public String getConstituents() {
        return "Orange Cone";
    }//Base Entity and both of them are IceCreamCone
}
