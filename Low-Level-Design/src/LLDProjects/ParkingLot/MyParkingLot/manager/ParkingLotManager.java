package LLDProjects.ParkingLot.MyParkingLot.manager;

import LLDProjects.ParkingLot.MyParkingLot.entities.Ticket;
import LLDProjects.ParkingLot.MyParkingLot.entities.Vehicle;
import LLDProjects.ParkingLot.MyParkingLot.entities.VehicleType;
import LLDProjects.ParkingLot.MyParkingLot.entities.slots.BikeSlots;

public class ParkingLotManager {
    //This will be the orchestrator of parking lot

    //This will check the available space
    public void getAvailableSlots(VehicleType vehicle) {
        if (vehicle == VehicleType.BIKE) {
            BikeSlots bikeSlots = new BikeSlots();
            bikeSlots.slot_available(VehicleType.BIKE);
        }
    }

    public void getOccupiedSlots(VehicleType vehicle) {
        if (vehicle == VehicleType.BIKE) {
            BikeSlots bikeSlots = new BikeSlots();
            bikeSlots.slot_available(VehicleType.BIKE);
        }
    }

    Ticket ticket = new Ticket();

    //This will mark the entry
    public void parkVehicle(String vehicle, String vehicleNo) {
        //This will update the HashMap from ParkingMap
        //Will call Ticket class to create a ticket number and entry time on it
        //Along with the vehicle type
        //Floor Number and Slot Number
        //Will use builder DP for this.
    }

    //This will mark the exit + ticket generation
    public void unparkVehicle(String vehicle, String vehicleNo) {
        //This will find the vehicle
        //Update the ParkingMap
        //Will call the Ticket class's - getParkingCharges method
    }
}