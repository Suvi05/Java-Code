package LLDProjects.ParkingLot.ChatGPTParkingLot;

import LLDProjects.ParkingLot.ChatGPTParkingLot.entities.*;
import LLDProjects.ParkingLot.ChatGPTParkingLot.managers.ParkingLotManager;
import LLDProjects.ParkingLot.ChatGPTParkingLot.strategies.pricing.HourlyPricingStrategy;
import LLDProjects.ParkingLot.ChatGPTParkingLot.strategies.pricing.PricingStrategy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Floor> floors = new ArrayList<>();

        for (int i = 1; i <= 2; i++) {
            List<Slot> slots = new ArrayList<>();
            slots.add(new Slot(1, VehicleType.BIKE));
            slots.add(new Slot(2, VehicleType.CAR));
            slots.add(new Slot(3, VehicleType.TRUCK));
            floors.add(new Floor(i, slots));
        }

        PricingStrategy pricingStrategy = new HourlyPricingStrategy();
        ParkingLotManager manager = new ParkingLotManager(floors, pricingStrategy);

        Vehicle v1 = new Vehicle("KA01AB1234", VehicleType.CAR);
        Vehicle v2 = new Vehicle("KA02XY1111", VehicleType.BIKE);

        Ticket t1 = manager.parkVehicle(v1);
        Ticket t2 = manager.parkVehicle(v2);

        manager.getAvailableSlots(VehicleType.CAR);

        manager.unparkVehicle(t1.getTicketId());

        manager.getAvailableSlots(VehicleType.CAR);
    }
}