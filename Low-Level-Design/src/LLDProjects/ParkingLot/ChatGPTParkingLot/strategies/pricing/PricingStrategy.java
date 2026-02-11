package LLDProjects.ParkingLot.ChatGPTParkingLot.strategies.pricing;

import LLDProjects.ParkingLot.ChatGPTParkingLot.entities.Ticket;

import java.time.LocalDateTime;

public interface PricingStrategy {
    double calculatePrice(Ticket ticket, LocalDateTime exitTime);
}
