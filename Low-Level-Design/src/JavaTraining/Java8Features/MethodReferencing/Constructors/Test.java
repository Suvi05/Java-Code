package JavaTraining.Java8Features.MethodReferencing.Constructors;

public class Test {
    //Not required in case of Constructor Mapping
//    public static void myMethod(String s) {
//        System.out.println("Inside the Reference Method: " + s);
//    }
    public static void main(String[] args) {
        //Lambda expression of Functional Interface's method
        MyInterface f = s -> new MyClass(s);
        f.get("Using Lambdas");

        //Constructor Mapping
        //ClassName: new(in place of using constructor's name)
        //This "new" will automatically map it to "get" method
        MyInterface f1 = MyClass::new;
        f1.get("Using Constructor Mapping");
    }
}
/*
Output:
Inside the Constructor: Using Lambdas
Inside the Constructor: Using Constructor Mapping
 */