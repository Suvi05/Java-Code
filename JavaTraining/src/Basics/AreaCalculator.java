package Basics;

import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println("My Area Calculator");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length: ");
        int l = sc.nextInt();
        System.out.print("Enter Breath: ");
        int b = sc.nextInt();
        for (int i=0;i<10;++i){
            System.out.println("Hello");
            i=i+2;
            if(i>=10)
                System.out.println("Error");
        }
        int volume = calc(l, b);
        System.out.println("Volume : " + volume);
    }

    public static int calc(int l, int b) {
        return l * b;
    }
}
