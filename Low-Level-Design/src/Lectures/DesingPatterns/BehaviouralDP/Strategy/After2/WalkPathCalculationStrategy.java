package Lectures.DesingPatterns.BehaviouralDP.Strategy.After2;

public class WalkPathCalculationStrategy implements PathCalculationStrategy {

    @Override
    public void calculatePath(String from, String to) {
        System.out.println("Finding path for Walking");
    }
}
