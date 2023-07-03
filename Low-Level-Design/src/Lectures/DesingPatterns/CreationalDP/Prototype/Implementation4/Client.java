package Lectures.DesingPatterns.CreationalDP.Prototype.Implementation4;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Bird b1 = new Bird();

        b1.setColor("BirdColor");
        b1.setName("BirdName");
        b1.setWeight(100);

        Sparrow s1 = new Sparrow();
        s1.setColor("SparrowColor");
        s1.setLsize(5);

        Crow c1 = new Crow();
        c1.setSound("CrowSound");
        c1.setWeight(200);

        List<Bird> birds = List.of(
                b1,
                s1,
                c1
        );

        List<Bird> children = new ArrayList<>();

        for (Bird parent : birds) {
            children.add(parent.clone());
        }
    }
}
