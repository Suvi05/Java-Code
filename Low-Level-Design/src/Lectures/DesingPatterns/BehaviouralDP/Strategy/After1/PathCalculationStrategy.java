package Lectures.DesingPatterns.BehaviouralDP.Strategy.After1;

//Same to same like Fly method example, the classes who want to calculate the path will implement this interface
public interface PathCalculationStrategy {
    void calculatePath(String from, String to);
    //This will not contain mode, because the file which will implement this will already know the mode.
}
