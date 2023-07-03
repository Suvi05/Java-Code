package JavaTraining.Inheritance.HeirarchicalInheritance;

import JavaTraining.Packages.p1.B;

public class Test {
    public static void main(String[] args) {
        Car c=new Car();
        //String carFuel= c.fuel();
       // System.out.println(carFuel);
        Bike b=new Bike();
        System.out.println(b.fuel());
    }
}
