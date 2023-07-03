package Lectures.DesingPatterns.CreationalDP.Singleton.Implementation2;

public class Main {
    public static void main(String[] args) {
        Database db1 = Database.getInstance();
        Database db2 = Database.getInstance();
    }
}
