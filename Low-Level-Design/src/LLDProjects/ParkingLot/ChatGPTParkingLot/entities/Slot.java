package LLDProjects.ParkingLot.ChatGPTParkingLot.entities;

public class Slot {
    private final int slotNumber;
    private final VehicleType slotType;
    private boolean occupied;
    private Vehicle parkedVehicle;

    public Slot(int slotNumber, VehicleType slotType) {
        this.slotNumber = slotNumber;
        this.slotType = slotType;
        this.occupied = false;
    }

    public boolean canPark(Vehicle vehicle) {
        if (vehicle.getVehicleType() == VehicleType.BIKE) {
            return slotType == VehicleType.BIKE || slotType == VehicleType.CAR;
        }
        return vehicle.getVehicleType() == slotType;
    }

    public void parkVehicle(Vehicle vehicle) {
        this.parkedVehicle = vehicle;
        this.occupied = true;
    }

    public void unparkVehicle() {
        this.parkedVehicle = null;
        this.occupied = false;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public int getSlotNumber() {
        return slotNumber;
    }

    public VehicleType getSlotType() {
        return slotType;
    }
}
