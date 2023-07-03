package Lectures.DesingPatterns.CreationalDP.Singleton.Implementation1FailCondition;

public class Database {
    String val;

    private Database(String val) { //Private Constructor
        this.val = val;
    }

    private static Database instance = null;

    public static Database getInstance(String val) { //Public method to create DB Object from other classes
        if (instance == null) {
            instance = new Database(val);
        }
        return instance;
    }
}
