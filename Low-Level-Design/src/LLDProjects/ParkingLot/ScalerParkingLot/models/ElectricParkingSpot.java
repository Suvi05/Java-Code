package LLDProjects.ParkingLot.ScalerParkingLot.models;

public class ElectricParkingSpot extends ParkingSpot {
    private ElectricCharger eLectricCharger;

    public ElectricParkingSpot(ElectricCharger eLectricCharger) {
        this.eLectricCharger = eLectricCharger;
    }
}