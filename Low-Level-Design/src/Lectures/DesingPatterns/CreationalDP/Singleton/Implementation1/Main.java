package Lectures.DesingPatterns.CreationalDP.Singleton.Implementation1;

public class Main {
    public static void  main(String[] args) {
        Database db1 = Database.getInstance();
        Database db2 = Database.getInstance();

        RandomClass randomClass = new RandomClass();
        //In random class also the object is pointing to same object.
    }
}
