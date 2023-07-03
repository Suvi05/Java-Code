package Lectures.DesingPatterns.StructuralDP.Decorator;

public class Customer {
    public static void main(String[] args) {
        //IceCreamCone emptyVanilla = new VanillaScoop(null); //For Checking Null pointer exception

        //Chocobar    : Blue Cone + 2 Chocolate
        IceCreamCone chocobar = new ChocolateScoop(new ChocolateScoop(new BlueCone()));

        //Kesar Pista : Orange Cone + 1 Vanilla
        IceCreamCone kesarPista = new VanillaScoop(new OrangeCone());

        IceCreamCone chocobarWithVanilla = new VanillaScoop(chocobar);
        //Here it is not creating a new object but using the same Chocobar Object and then decorating it.

        IceCreamCone iceCreamCone = new ChocolateScoop(new ChocolateScoop(new VanillaScoop(new OrangeCone())));

        System.out.println("Constituents of Ice cream : " + chocobarWithVanilla.getConstituents());
        System.out.println("Cost of Ice cream : " + chocobarWithVanilla.getCost());
        System.out.println("Constituents of Ice cream : " + iceCreamCone.getConstituents());
        System.out.println("Cost of Ice cream : " + iceCreamCone.getCost());
    }
}
//If we want to add one more cone to a cone then we have to implement 2 constructors in Cone's code,
//one with IceCreamCone iceCreamCone and another one as empty