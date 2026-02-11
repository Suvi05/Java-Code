package LLDProjects.ParkingLot.ChatGPTParkingLot.strategies.slotAllocation;

import LLDProjects.ParkingLot.ChatGPTParkingLot.entities.Slot;
import LLDProjects.ParkingLot.ChatGPTParkingLot.entities.Vehicle;

public interface SlotAllocationStrategy {
    Slot allocateSlot(Vehicle vehicle);
}
