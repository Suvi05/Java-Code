package JavaTraining.Multithreading;

import java.util.Scanner;

public class JoinDemo extends Thread {
    static int n, sum = 0;

    public static void main(String[] args) {
        System.out.println("Sum of N Numbers ");
        System.out.println("Enter a Number : ");
        Scanner sc = new Scanner(System.in);
        JoinDemo.n = sc.nextInt();

        JoinDemo jd = new JoinDemo();
        jd.start();

        try {
            jd.join();
        } catch (InterruptedException e) {
            System.out.println("Error in Join");
        }

        System.out.println("Sum of First" + JoinDemo.n + " Number is " + JoinDemo.sum);
    }

    public void run() {
        for (int i = 1; i <= JoinDemo.n; i++) {
            JoinDemo.sum = JoinDemo.sum + i; //JoinDemo.sum =+i;
        }
    }
}
