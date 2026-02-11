package LLDProjects.ParkingLot.MyParkingLot.strategies.paymentStrategies;

public class PayViaCash implements PaymentStrategies{
    @Override
    public void pay() {
        System.out.println("Paid via Cash");
    }
}
