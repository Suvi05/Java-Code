package Lectures.DesingPatterns.BehaviouralDP.Strategy.After2;

//Main class is Initializing the codebase.
public class Main {
    public static void main(String[] args) {

        //Creating Object of Registry
        PathCalculationStrategyRegistry pathCalculationStrategyRegistry = new PathCalculationStrategyRegistry();

        //Adding data to Registry.
        pathCalculationStrategyRegistry.register(TransportMode.CAR, new CarPathCalculationStrategy());

        pathCalculationStrategyRegistry.register(TransportMode.BIKE, new BikePathCalculationStrategy());

        pathCalculationStrategyRegistry.register(TransportMode.WALK, new WalkPathCalculationStrategy());

        //Passing Object of Registry in Google Map's Constructor
        GoogleMaps googleMaps = new GoogleMaps(pathCalculationStrategyRegistry);

        //  -> /findPath?from={Delhi}&to{Saharanpur}&MODE=CAR
        googleMaps.findPath("Delhi", "Saharanpur", TransportMode.CAR);
    }
}
