package LLDProjects.ParkingLot.ScalerParkingLot.strategies.spotAssignmentStrategy;

import LLDProjects.ParkingLot.ScalerParkingLot.models.EntryGate;
import LLDProjects.ParkingLot.ScalerParkingLot.models.ParkingLot;
import LLDProjects.ParkingLot.ScalerParkingLot.models.ParkingSpot;
import LLDProjects.ParkingLot.ScalerParkingLot.models.SpotType;

public interface SpotAssignmentStrategy {
    ParkingSpot assignSpot(ParkingLot parkingLot,
                           SpotType spotType,
                           EntryGate entryGate);
}