package JavaTraining.Exceptions.RuntimeException;

import java.util.Scanner;

public class ArithematicExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter first number : ");
        int b = sc.nextInt();


        int result = a / b;
        System.out.print("Result : " + result);
    }
}
