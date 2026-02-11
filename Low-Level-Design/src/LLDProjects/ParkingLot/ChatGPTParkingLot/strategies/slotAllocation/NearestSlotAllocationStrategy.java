package LLDProjects.ParkingLot.ChatGPTParkingLot.strategies.slotAllocation;

import LLDProjects.ParkingLot.ChatGPTParkingLot.entities.Floor;
import LLDProjects.ParkingLot.ChatGPTParkingLot.entities.Slot;
import LLDProjects.ParkingLot.ChatGPTParkingLot.entities.Vehicle;
import LLDProjects.ParkingLot.ChatGPTParkingLot.entities.VehicleType;

import java.util.List;
import java.util.Map;

public class NearestSlotAllocationStrategy implements SlotAllocationStrategy {
    private final List<Floor> floors;
    private final Map<VehicleType, List<Slot>> availableSlotsMap;

    public NearestSlotAllocationStrategy(List<Floor> floors, Map<VehicleType, List<Slot>> availableSlotsMap) {
        this.floors = floors;
        this.availableSlotsMap = availableSlotsMap;
    }

    @Override
    public Slot allocateSlot(Vehicle vehicle) {

        for (Floor floor : floors) {
            for (Slot slot : floor.getSlots()) {

                if (!slot.isOccupied() && slot.canPark(vehicle)) {
                    return slot;
                }
            }
        }
        return null;
    }
}
