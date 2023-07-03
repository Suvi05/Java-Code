package Lectures.DesingPatterns.StructuralDP.FlyWeight.AfterVersion;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        //Before client even start creating the flying bullets he will first create different type of bullets and will store them in registry.
        BulletRegistry bulletRegistry = new BulletRegistry();

        //Adding different type of Bullets in Registry.
        Bullet fiveMMBullet = new Bullet();
        fiveMMBullet.setBulletType(BulletType.FIVE_MM);
        bulletRegistry.registerBullet(BulletType.FIVE_MM, fiveMMBullet);

        Bullet sevenMMBullet = new Bullet();
        sevenMMBullet.setBulletType(BulletType.SEVEN_MM);
        bulletRegistry.registerBullet(BulletType.SEVEN_MM, sevenMMBullet);

        List<FlyingBullet> flyingBullets = new ArrayList<>();
        //Storing all the bullets to demonstrate it like RAM.

        for (int i = 0; i < 200000; i++) {
            FlyingBullet flyingBullet = new FlyingBullet();
            //Add Extrinsic properties to this flying Bullet too.
            flyingBullet.setSpeed(120); //For this only we have added Setters and Getters
            //... same for others
            flyingBullet.setBullet(bulletRegistry.getBullet(BulletType.FIVE_MM));
            //We will set this bullet by fetching it from Registry.
            flyingBullets.add(flyingBullet);
            //Adding Flying bullet objects into RAM(Array)
        }
        System.out.println("DONE");
    }
}