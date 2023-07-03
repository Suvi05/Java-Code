package Lectures.DesingPatterns.CreationalDP.Singleton.Implementation3;

public class Database {
    String val;
    private static Database instance = null;

    private Database(String val) { //Private Constructor
        this.val = val;
    }


    public static Database getInstance(String val) { //Public method to create DB Object from other classes

        if (instance == null) {
            synchronized (Database.class) {
                if (instance == null) { //Double Check Locking
                    instance = new Database(val);
                }
            }
        }
        return instance;
    }
}
