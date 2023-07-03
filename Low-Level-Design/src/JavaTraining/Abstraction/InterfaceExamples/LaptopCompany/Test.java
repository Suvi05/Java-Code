package JavaTraining.Abstraction.InterfaceExamples.LaptopCompany;

public class Test {
    public static void main(String[] args) {
        EliteBook eb = new EliteBook();
        eb.keyboardFunc();
        eb.soundFunc();

        System.out.println();

        HP324 hp = new HP324();
        hp.keyboardFunc();
        hp.soundFunc();

        System.out.println();

        MacBookAir mba = new MacBookAir();
        mba.keyboardFunc();
        mba.soundFunc();
    }
}
