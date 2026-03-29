package LLDProjects.ParkingLot.ScalerParkingLot.controllers;

import LLDProjects.ParkingLot.ScalerParkingLot.dtos.GenerateTicketRequestDto;
import LLDProjects.ParkingLot.ScalerParkingLot.dtos.GenerateTicketResponseDto;
import LLDProjects.ParkingLot.ScalerParkingLot.services.TicketService;

public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public GenerateTicketResponseDto generateTicket(
            GenerateTicketRequestDto request
    ) {
        return null;
    }
}