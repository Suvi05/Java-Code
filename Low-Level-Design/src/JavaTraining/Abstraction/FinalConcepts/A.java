package JavaTraining.Abstraction.FinalConcepts;

public class A {
    final static float pi = 3.55f;
//
//    A() {
//        //pi = 3.14f; //We can not initialise variable in  constructor if it is already assigned in case of FINAL
//    }

    public void displayValue() {
        System.out.println(A.pi);
    }

    public static void main(String[] args) {

        A a = new A();
        //a.pi = 3.35f;
        System.out.println(a.pi);

    }

}
