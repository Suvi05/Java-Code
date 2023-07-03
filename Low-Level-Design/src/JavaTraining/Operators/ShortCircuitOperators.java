package JavaTraining.Operators;

public class ShortCircuitOperators {
    public static void main(String[] args) {
        boolean x=false;
        boolean y=true;

        if(x && y) {  //1 -> True
            System.out.println("Inside IF Condition");
        }
    }
}
