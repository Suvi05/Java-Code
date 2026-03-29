package LLDProjects.ParkingLot.ScalerParkingLot.repositories;

import LLDProjects.ParkingLot.ScalerParkingLot.models.ParkingLot;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotRepository {
    private Map<Long, ParkingLot> parkingLots = new HashMap<>();
    private Long lastCount = 0L;

    public ParkingLot save(ParkingLot parkingLot) {
        lastCount += 1;
        parkingLot.setId(lastCount);
        parkingLots.put(lastCount, parkingLot);
        return parkingLot;
    }

    public ParkingLot getById(Long id) {
        return parkingLots.get(id);
    }


    public ParkingLot update(Long id, ParkingLot parkingLot) {
        parkingLots.put(id, parkingLot);
        return parkingLots.get(id);
    }
}