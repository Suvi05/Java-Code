package LLDProjects.ParkingLot.ScalerParkingLot.dtos;

import LLDProjects.ParkingLot.ScalerParkingLot.models.ParkingLot;

public class CreateParkingLotResponseDto extends ResponseDto {
    private ParkingLot parkingLot;
    private ResponseStatusDto responseStatus;
//    private Response

    public ParkingLot getParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public ResponseStatusDto getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatusDto responseStatus) {
        this.responseStatus = responseStatus;
    }
}