package LLDProjects.ParkingLot.MyParkingLot.strategies.paymentStrategies;

public class PayViaCard implements PaymentStrategies {
    @Override
    public void pay() {
        System.out.println("Paid via Card");
    }
}
