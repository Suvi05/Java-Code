package JavaTraining.Exceptions.UncheckedExceptionHandling;

public class MultipleTryCatchInheritance {
    public static void main(String[] args) { //Khali string //abc


        try {
            String input = args[0]; //ArrayOutOfBoundException -> 1st element? //abc
            System.out.println("Input is : " + input);

            int output = Integer.parseInt(input); //Error -> Khali cheez ko number me convert karo
            System.out.println("Output is : " + output);

        } catch (Throwable e) {
            System.out.println("Array Index out of bound exception is there. Solve it! ");
        }

        System.out.println("Other code will go here");
    }
}
