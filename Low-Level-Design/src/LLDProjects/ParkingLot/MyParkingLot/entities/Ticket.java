package LLDProjects.ParkingLot.MyParkingLot.entities;

import java.time.LocalDateTime;

public class Ticket {
    private int ticket_id = 0;
    private String vehicleNo;
    private int floorNo;
    private int slotNo;


    //Will use a Builder design patter to build the ticket on the go.

    public void parkVehicle(VehicleType vehicle) {
        ticket_id = ticket_id++;

    }

    public int getParkingCharges(LocalDateTime start_time, LocalDateTime end_time, VehicleType vehicleType) {
        //Will calculate the Parking fees calling the ParkingFeesStrategies
        return 0;
    }
}
