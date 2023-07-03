package Lectures.DesingPatterns.CreationalDP.Prototype.Implementation2;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Bird> birds = List.of(
                new Crow(),
                new Sparrow(),
                new Crow()
        );

        List<Bird> children = new ArrayList<>();

        for (Bird parent : birds) {
            children.add(parent.clone());
        }
    }
}
