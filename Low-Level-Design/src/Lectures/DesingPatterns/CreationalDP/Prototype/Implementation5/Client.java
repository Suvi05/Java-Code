package Lectures.DesingPatterns.CreationalDP.Prototype.Implementation5;

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

        //Creating new Birds for Future
        Sparrow blueSparrow = new Sparrow();
        blueSparrow.setLsize(10);

        Crow blueCrow = new Crow();
        blueCrow.setSound("BlueCrowSound");

        //Adding those birds into Bird Registry
        BirdRegistry br = new BirdRegistry();
        br.registerBird("blueCrow", blueCrow);
        br.registerBird("blueSparrow", blueSparrow);

        List<String> getBirdOfTypes = List.of(
                "blueCrow",
                "blueSparrow",
                "blueCrow" //2 blueCrows are taken out from Registry
        );

        List<Bird> requestedBird = new ArrayList<>();

        for (String type : getBirdOfTypes) {
            requestedBird.add(br.getBird(type));
        }
        System.out.println("DONE");
    }
}
