package Lectures.DesingPatterns.StructuralDP.Adapter.Flipkart;

public interface PaymentGateway {
    Long payViaCC(String cardNumber, int cvv, int expMonth, int expYear);

    PaymentStatus getStatus(Long id);
}
