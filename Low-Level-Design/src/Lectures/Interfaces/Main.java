package Lectures.Interfaces;

import java.util.List;

public class    Main {
    public static void main(String[] args) {
        List<Herbivore> herbivores = List.of(
                new Human(),
                new Dog()
                //new Cat()   //<- Not allowed
        );
        for (Herbivore herbivore : herbivores) {
            herbivore.eatPlant();
        }
    }
}
