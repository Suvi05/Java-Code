package JavaTraining.Exceptions.UncheckedExceptionHandling;

import java.util.Scanner;

public class ArithematicExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter first number : ");
            int a = sc.nextInt();
            System.out.print("Enter first number : ");
            int b = sc.nextInt();
            int result = a / b;
            System.out.println("Result : " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Sorry bro! You can't divide by 0");
            System.out.println("Here we will close the resources");
        }
        finally {
            System.out.println("Me param satya hu!!");
        }
    }
}
