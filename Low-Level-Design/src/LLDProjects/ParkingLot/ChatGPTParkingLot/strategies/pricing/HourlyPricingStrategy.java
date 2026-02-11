package LLDProjects.ParkingLot.ChatGPTParkingLot.strategies.pricing;

import LLDProjects.ParkingLot.ChatGPTParkingLot.entities.Ticket;

import java.time.Duration;
import java.time.LocalDateTime;

public class HourlyPricingStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(Ticket ticket, LocalDateTime exitTime) {

        long minutes = Duration.between(
                ticket.getEntryTime(),
                exitTime
        ).toMinutes();

        long hours = (minutes / 60) + 1; // minimum 1 hour

        return hours * 50; // ₹50 per hour
    }
}
