package Lectures.DesingPatterns.BehaviouralDP.Strategy.After1;

//Simple Factory Implementation
public class GoogleMaps {

    private PathCalculationStrategyFactory pathCalculationStrategyFactory;

    public void findPath(String from, String to, TransportMode mode) {
        //Finding "Path Calculation Method/Class" of provided "Transport Mode":
        //Strategy' Interface--Interface ka ref variable-----Obj reference of Factory--Method from Factory
        PathCalculationStrategy pathCalculationStrategy = pathCalculationStrategyFactory.getPathCalculationStrategyForMode(mode);

        //Now we have the class whose "Path Calculation Method" has to be called:
        pathCalculationStrategy.calculatePath(from, to);
    }
}