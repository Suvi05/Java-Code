package JavaTraining.Inheritance.HeirarchicalInheritance;

public class Car extends Vehicle{
    @Override     //Annotation
    String fuel() {
        return "Diesel";
    }
}
//@Overriding annotation came after Java 5,that makes sure or confirms with
//the compiler that this method is being overridden
