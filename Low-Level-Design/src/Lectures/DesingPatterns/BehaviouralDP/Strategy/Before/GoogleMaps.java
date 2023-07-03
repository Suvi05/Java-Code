package Lectures.DesingPatterns.BehaviouralDP.Strategy.Before;

public class GoogleMaps {
    public void findPath(String from, String to, TransportMode mode) {
        if (mode == TransportMode.WALK) {
            System.out.println("Finding path for Walking");
        } else if (mode == TransportMode.CAR) {
            System.out.println("Finding path for Car");
        } else if (mode == TransportMode.BIKE) {
            System.out.println("Finding path for Bike");
        }
    }
}

//Problems with this codebase : OCP and SRP