package Lectures.DesingPatterns.CreationalDP.Prototype.Implementation5;

import java.util.HashMap;
import java.util.Map;

public class BirdRegistry {
    private Map<String, Bird> birds = new HashMap<>();//We can make Map<Enum,Bird> to remove Typo safe/Compile Time Safe

    //Register a Bird
    public void registerBird(String name, Bird bird) {
        birds.put(name, bird);
    }

    //To get a Bird
    public Bird getBird(String name) {
        return birds.get(name).clone();
    }
}
/*Benefit of Having Bird registry is :
 * I can store different type of birds here, for example there is a sparrow in the future,
 * longlegsparrow
 * */