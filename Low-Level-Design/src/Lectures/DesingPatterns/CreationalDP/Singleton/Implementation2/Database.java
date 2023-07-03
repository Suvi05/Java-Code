package Lectures.DesingPatterns.CreationalDP.Singleton.Implementation2;
//Eager Initialization
public class  Database {
    private static Database instance = new Database();

    private Database() {
    } //Private Constructor

    public static Database getInstance() { //Public method to create DB Object from other classes
        return instance;
    }
}
