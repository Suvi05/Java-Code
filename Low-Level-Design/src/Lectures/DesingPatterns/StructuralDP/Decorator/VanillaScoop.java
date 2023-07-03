package Lectures.DesingPatterns.StructuralDP.Decorator;

public class VanillaScoop implements IceCreamCone {//Because Vanilla scoop will also end up in a Ice Cream Cone

    private IceCreamCone iceCreamCone;

    public VanillaScoop(IceCreamCone iceCreamCone) { //Decorating Entity //Constructor with parameters
        //When implementing a decorator, if something is not a base entity, in that particular case, make sure that
        //base case should not be null.
        if (iceCreamCone == null) {
            System.out.println("Ice Cream can't start from Vanilla Scoop you need to add a Cone First");
            throw new NullPointerException("No Cone Found");
        }
        this.iceCreamCone = iceCreamCone;
    }

    @Override
    public int getCost() {
        return iceCreamCone.getCost() + 20;//Previous + Current
    }

    @Override
    public String getConstituents() {
        return iceCreamCone.getConstituents() + " -> Vanilla"; //Previous + Current
//        String str = iceCreamCone.getConstituents() + "Vanilla";
//        System.out.println(str);
//        return str;
    }
}
