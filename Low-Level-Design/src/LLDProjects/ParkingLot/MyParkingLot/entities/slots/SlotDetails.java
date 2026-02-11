package LLDProjects.ParkingLot.MyParkingLot.entities.slots;

import LLDProjects.ParkingLot.MyParkingLot.entities.VehicleType;

public interface SlotDetails {
    boolean slot_available(VehicleType vehicleType);
}
