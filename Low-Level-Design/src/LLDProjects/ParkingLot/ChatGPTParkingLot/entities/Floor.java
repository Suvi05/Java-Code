package LLDProjects.ParkingLot.ChatGPTParkingLot.entities;

import java.util.List;

public class Floor {
    private final int floorNumber;
    private final List<Slot> slots;

    public Floor(int floorNumber, List<Slot> slots) {
        this.floorNumber = floorNumber;
        this.slots = slots;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public List<Slot> getSlots() {
        return slots;
    }
}
