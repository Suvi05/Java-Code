package Lectures.DesingPatterns.BehaviouralDP.Strategy.After1;

public class Main {
    public static void main(String[] args) {
        PathCalculationStrategyFactory factory = new PathCalculationStrategyFactory();
        GoogleMaps googleMaps = new GoogleMaps(factory);
        googleMaps.findPath("Delhi", "Banaras", TransportMode.WALK);
    }
}
