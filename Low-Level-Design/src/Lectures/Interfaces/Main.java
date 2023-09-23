package Lectures.Interfaces;

import java.util.List;

public class    Main {
    public static void main(String[] args) {
        //We can add object of only those classes which implements Herbivores(or interfaces extending herbivores) in it.
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
