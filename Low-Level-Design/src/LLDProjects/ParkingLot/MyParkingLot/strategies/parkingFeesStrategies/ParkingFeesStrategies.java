package LLDProjects.ParkingLot.MyParkingLot.strategies.parkingFeesStrategies;

import LLDProjects.ParkingLot.MyParkingLot.entities.VehicleType;

import java.time.LocalDateTime;

public interface ParkingFeesStrategies {
    public int parkingFeesCalculation(LocalDateTime start_time, LocalDateTime end_time, VehicleType vehicleType);
}
