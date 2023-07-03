package Lectures.DesingPatterns.StructuralDP.Decorator;

public class ChocolateScoop implements IceCreamCone {
    IceCreamCone iceCreamCone;

    public ChocolateScoop(IceCreamCone iceCreamCone) { //Decorating Entity //Constructor with parameters.
        if (iceCreamCone.getCost() > 100) { //We can also do validations here.
            System.out.println("Ice Cream's cost has gone above 100");
            throw new RuntimeException("Can't create ice cream of rupees more than 100");
        } else {
            this.iceCreamCone = iceCreamCone;
        }
    }

    @Override
    public int getCost() {
        return iceCreamCone.getCost() + 30;//Previous + Current
    }

    @Override
    public String getConstituents() {
        return iceCreamCone.getConstituents() + " -> Chocolate";//Previous + Current
    }
}