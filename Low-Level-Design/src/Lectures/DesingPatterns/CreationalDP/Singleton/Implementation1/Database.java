package Lectures.DesingPatterns.CreationalDP.Singleton.Implementation1;

public class Database {
    private Database() {
    } //Private Constructor

    private static Database instance = null;

    public static Database getInstance() { //Public method to create DB Object from other classes
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }
}
