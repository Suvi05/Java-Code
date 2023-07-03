package JavaTraining.Polymorphism.RunTime;

import javax.crypto.Mac;

public class Test {
    public static void main(String[] args) {
        MacbookPro m1 = new MacbookPro();
        MacbookAir m2 = new MacbookAir();

        m1.start();
        m1.stop();

        System.out.println();

        m2.start();
        m2.stop();
    }
}
