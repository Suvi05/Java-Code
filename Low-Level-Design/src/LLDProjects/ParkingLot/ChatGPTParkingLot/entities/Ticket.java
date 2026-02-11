package LLDProjects.ParkingLot.ChatGPTParkingLot.entities;

import java.time.LocalDateTime;

public class Ticket {
    private final String ticketId;
    private final String vehicleNumber;
    private final int floorNumber;
    private final int slotNumber;
    private final LocalDateTime entryTime;

    public Ticket(String ticketId,
                  String vehicleNumber,
                  int floorNumber,
                  int slotNumber,
                  LocalDateTime entryTime) {
        this.ticketId = ticketId;
        this.vehicleNumber = vehicleNumber;
        this.floorNumber = floorNumber;
        this.slotNumber = slotNumber;
        this.entryTime = entryTime;
    }

    public String getTicketId() {
        return ticketId;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public int getSlotNumber() {
        return slotNumber;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }
}
