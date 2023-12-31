package Lectures.DesingPatterns.BehaviouralDP.Strategy.After2;

//Registry Implementation
public class GoogleMaps {

    private PathCalculationStrategyRegistry pathCalculationStrategyRegistry;

    public GoogleMaps(PathCalculationStrategyRegistry registry) {
        this.pathCalculationStrategyRegistry = registry;
    }


    public void findPath(String from, String to, TransportMode mode) {

        PathCalculationStrategy pathCalculationStrategy = pathCalculationStrategyRegistry.get(mode);

        pathCalculationStrategy.calculatePath(from, to);
    }
}
