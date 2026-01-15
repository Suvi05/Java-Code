package Lectures.DesingPatterns.StructuralDP.FlyWeight.BeforeVersion;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Bullet> bullets = new ArrayList<>();
        //Storing all the bullets to demonstrate it like RAM.

        for (int i = 0; i < 200000; i++) {
            Bullet bullet = new Bullet();
            bullet.setImage(new byte[1000]); //1KB Image
            bullets.add(bullet);
            //Adding  bullet objects into RAM(Array)
            //Using Profiler we can see the amount of memory used by both the techniques.
        }
        System.out.println("DONE");
        System.out.println("DONE - waiting...");
        new java.util.Scanner(System.in).nextLine();
        //👉 Program tab tak alive rahega jab tak tu Enter nahi dabata
    }
}
