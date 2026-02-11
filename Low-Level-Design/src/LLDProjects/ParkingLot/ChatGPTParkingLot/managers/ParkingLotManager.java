package LLDProjects.ParkingLot.ChatGPTParkingLot.managers;

import LLDProjects.ParkingLot.ChatGPTParkingLot.entities.*;
import LLDProjects.ParkingLot.ChatGPTParkingLot.strategies.pricing.PricingStrategy;
import LLDProjects.ParkingLot.ChatGPTParkingLot.strategies.slotAllocation.NearestSlotAllocationStrategy;
import LLDProjects.ParkingLot.ChatGPTParkingLot.strategies.slotAllocation.SlotAllocationStrategy;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLotManager {
    private final List<Floor> floors;
    private final Map<String, Ticket> activeTickets;
    private final Map<VehicleType, List<Slot>> availableSlotsMap;
    private final SlotAllocationStrategy allocationStrategy;
    private int ticketCounter = 1;
    private final PricingStrategy pricingStrategy;

    public ParkingLotManager(List<Floor> floors, PricingStrategy pricingStrategy) {

        this.floors = floors;
        this.pricingStrategy = pricingStrategy;
        this.activeTickets = new HashMap<>();
        this.availableSlotsMap = new HashMap<>();

        for (VehicleType type : VehicleType.values()) {
            availableSlotsMap.put(type, new ArrayList<>());
        }

        for (Floor floor : floors) {
            for (Slot slot : floor.getSlots()) {
                availableSlotsMap.get(slot.getSlotType()).add(slot);
            }
        }

        this.allocationStrategy =
                new NearestSlotAllocationStrategy(floors, availableSlotsMap);
    }

    public Ticket parkVehicle(Vehicle vehicle) {

        Slot slot = allocationStrategy.allocateSlot(vehicle);

        if (slot == null) {
            System.out.println("No available slot for vehicle.");
            return null;
        }

        slot.parkVehicle(vehicle);

        String ticketId = "T" + ticketCounter++;

        Ticket ticket = new Ticket(
                ticketId,
                vehicle.getVehicleNumber(),
                getFloorOfSlot(slot),
                slot.getSlotNumber(),
                LocalDateTime.now()
        );

        activeTickets.put(ticketId, ticket);

        System.out.println("Vehicle parked. Ticket ID: " + ticketId);
        return ticket;
    }

    public void unparkVehicle(String ticketId) {

        Ticket ticket = activeTickets.get(ticketId);

        if (ticket == null) {
            System.out.println("Invalid Ticket.");
            return;
        }

        LocalDateTime exitTime = LocalDateTime.now();

        double amount = pricingStrategy.calculatePrice(ticket, exitTime);

        for (Floor floor : floors) {
            for (Slot slot : floor.getSlots()) {
                if (slot.getSlotNumber() == ticket.getSlotNumber()
                        && floor.getFloorNumber() == ticket.getFloorNumber()) {

                    slot.unparkVehicle();
                    activeTickets.remove(ticketId);

                    System.out.println("Vehicle unparked.");
                    System.out.println("Parking Fee: ₹" + amount);
                    return;
                }
            }
        }
    }

    public void getAvailableSlots(VehicleType type) {
        System.out.println("Available slots for " + type + ":");
        for (Floor floor : floors) {
            for (Slot slot : floor.getSlots()) {
                if (!slot.isOccupied() && slot.getSlotType() == type) {
                    System.out.println("Floor " + floor.getFloorNumber()
                            + " Slot " + slot.getSlotNumber());
                }
            }
        }
    }

    private int getFloorOfSlot(Slot targetSlot) {
        for (Floor floor : floors) {
            if (floor.getSlots().contains(targetSlot)) {
                return floor.getFloorNumber();
            }
        }
        return -1;
    }
}
