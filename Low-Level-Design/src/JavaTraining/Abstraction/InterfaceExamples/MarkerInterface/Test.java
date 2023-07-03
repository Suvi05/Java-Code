package JavaTraining.Abstraction.InterfaceExamples.MarkerInterface;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        if(a instanceof Permission){ //Yes
            System.out.println("Permission is Granted ");
            a.show();
        }else{
            System.out.println("Permission is not Granted");
        }
    }
}
