package Lectures.DesingPatterns.BehaviouralDP.Strategy.After1;

//Simple Factory Class
public class PathCalculationStrategyFactory {

    //This file will let us call the correct method to create appropriate object which will be
    //called in main() GoogleMaps class.
    //We are using factory design method, b/c that creates different objects as per the requirements.

    public PathCalculationStrategy getPathCalculationStrategyForMode(TransportMode mode) {

        if (mode == TransportMode.WALK) {
            return new WalkPathCalculationStrategy();
        } else if (mode == TransportMode.CAR) {
            return new CarPathCalculationStrategy();
        } else if (mode == TransportMode.BIKE) {
            return new BikePathCalculationStrategy();
        }
        //We can use Registry DP to return instance of these Functions in place of returning new object Everytime.
        //Factory DP creates new object every time.
        return null;
    }
}
