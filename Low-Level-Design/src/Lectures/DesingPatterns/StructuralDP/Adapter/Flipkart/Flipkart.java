package Lectures.DesingPatterns.StructuralDP.Adapter.Flipkart;

import java.util.List;

public class Flipkart {
    private PaymentGateway paymentGateway;

    //Code for Multiple payment gateways:
    //private List<PaymentGateway> paymentGateway;
    public Flipkart(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void makePaymentViaCC(String cardNumber, int cvv, int expMonth, int expYear) {
        Long transactionId = paymentGateway.payViaCC(cardNumber, cvv, expMonth, expYear);

        //FAILURE's case is not handled Gracefully.
        while (!paymentGateway.getStatus(transactionId).equals(PaymentStatus.SUCCESS)) {
            System.out.println("Waiting");
        }
    }
}
