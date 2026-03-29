package LLDProjects.ParkingLot.ScalerParkingLot.dtos;

import LLDProjects.ParkingLot.ScalerParkingLot.models.ParkingLot;

public class UpdateParkingLotResponseDto extends ResponseDto {
    private ParkingLot parkingLot;

    public ParkingLot getParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }
}