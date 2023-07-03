package Lectures.Interfaces;

public class Human extends Mammal implements Omnivore{
    @Override
    public void eatAnimal() {
        System.out.println("Human is eating an Animal");
    }

    @Override
    public void eatPlant() {
        System.out.println("Human is eating Plants");
    }
}
