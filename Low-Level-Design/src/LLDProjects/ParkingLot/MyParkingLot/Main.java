package LLDProjects.ParkingLot.MyParkingLot;

import LLDProjects.ParkingLot.MyParkingLot.entities.VehicleType;
import LLDProjects.ParkingLot.MyParkingLot.manager.ParkingLotManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Sumit Parking station");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the type of Vehicle - CAR, BIKE or TRUCK");
        String vehicle = sc.next();

        VehicleType vehicleType;
        try {
            vehicleType = VehicleType.valueOf(vehicle);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid Vehicle Type Entered!!");
            return;
        }
        ParkingLotManager parkingLotManager = new ParkingLotManager();
        parkingLotManager.getAvailableSlots(vehicleType);
        parkingLotManager.getOccupiedSlots(vehicleType);

        System.out.println("Enter the Vehicle Number for your - CAR, BIKE or TRUCK");
        String vehicleNo = sc.next();
        parkingLotManager.parkVehicle(vehicle, vehicleNo);

        parkingLotManager.unparkVehicle(vehicle, vehicleNo);
    }
}
