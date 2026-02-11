package LLDProjects.ParkingLot.MyParkingLot.entities.slots;

import LLDProjects.ParkingLot.MyParkingLot.entities.ParkingMap;
import LLDProjects.ParkingLot.MyParkingLot.entities.VehicleType;

public class BikeSlots implements SlotDetails {
    int total_slots = 50;
    int occupied_slots;

    ParkingMap parkingMap=new ParkingMap();
    @Override
    public boolean slot_available(VehicleType vehicleType) {
        //If bikeSlots from ParkingMap is empty then return TRUE else FALSE
        return true;
    }
}
