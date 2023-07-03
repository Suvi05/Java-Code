package Lectures.DesingPatterns.CreationalDP.Singleton.Implementation4;

public class Main {
    public static void main(String[] args) {
        Database database = Database.GETINSTANCE;
        Database database1 = Database.GETINSTANCE;

        System.out.println(database.hashCode());
        System.out.println(database1.hashCode());
    }
}
