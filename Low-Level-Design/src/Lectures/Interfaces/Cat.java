package Lectures.Interfaces;

public class Cat extends Mammal implements Carnivore {
    @Override
    public void eatAnimal() {
        System.out.println("Cat is eating an Animal");
    }
}
