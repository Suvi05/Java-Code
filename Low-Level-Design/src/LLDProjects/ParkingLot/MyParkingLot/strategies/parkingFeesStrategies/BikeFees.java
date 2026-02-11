package LLDProjects.ParkingLot.MyParkingLot.strategies.parkingFeesStrategies;

import LLDProjects.ParkingLot.MyParkingLot.entities.VehicleType;
import LLDProjects.ParkingLot.MyParkingLot.strategies.paymentStrategies.PaymentStrategies;

import java.time.Duration;
import java.time.LocalDateTime;

public class BikeFees implements ParkingFeesStrategies {
    private static final int RATE_PER_HOUR = 20;

    @Override
    public int parkingFeesCalculation(LocalDateTime start_time, LocalDateTime end_time, VehicleType vehicleType) {
        long hours = Duration.between(start_time, end_time).toHours();

        if (hours == 0) {
            hours = 1;
        }
        return (int) hours * RATE_PER_HOUR;
    }
}
