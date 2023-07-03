package Lectures.DesingPatterns.StructuralDP.FlyWeight.AfterVersion;

import java.util.HashMap;
import java.util.Map;

public class BulletRegistry {
    //Purpose : To store the Bullet objects and allows us to use them later.
    //We store things in a Map in Registry.
    private Map<BulletType, Bullet> bullets = new HashMap<>();
    //Key of Every Bullet will be "BulletType" and we are storing "Bullet" type of object in it.

    //In registry, we normally have 2 methods... i.e. Register and Get

    public void registerBullet(BulletType type, Bullet bullet) {
        bullets.put(type, bullet);
    }

    public Bullet getBullet(BulletType bulletType) {
        return bullets.get(bulletType);
    }
}
