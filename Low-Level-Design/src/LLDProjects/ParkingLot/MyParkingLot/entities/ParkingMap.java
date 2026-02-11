package LLDProjects.ParkingLot.MyParkingLot.entities;

import java.util.HashMap;

public class ParkingMap {
    //Here Integer will tell the parking slot number and Boolean will tell if it is filled or not
    HashMap<Integer, Boolean> bikeSlots = new HashMap<>();
    HashMap<Integer, Boolean> carSlots = new HashMap<>();
    HashMap<Integer, Boolean> truckSlots = new HashMap<>();

    //Will update the parkingMap as soon as any vehicle enters and will also update when a vehicle lefts.
}
