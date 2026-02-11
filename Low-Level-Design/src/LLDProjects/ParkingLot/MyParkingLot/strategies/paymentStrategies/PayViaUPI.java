package LLDProjects.ParkingLot.MyParkingLot.strategies.paymentStrategies;

public class PayViaUPI implements PaymentStrategies{
    @Override
    public void pay() {
        System.out.println("Paid via UPI");
    }
}
