package Lectures.DesingPatterns.StructuralDP.Adapter.Flipkart;

import Lectures.DesingPatterns.StructuralDP.Adapter.RazorPay.RazorPayGateway;

//Internally it will use RazorPay's functions
public class RazorPayAdapter implements PaymentGateway {

    private RazorPayGateway razorPayGateway = new RazorPayGateway();

    @Override
    public Long payViaCC(String cardNumber, int cvv, int expMonth, int expYear) {
        String cvvString = String.valueOf(cvv);
        String expiry = String.valueOf(expMonth) + "/" + String.valueOf(expYear);
        String answer = razorPayGateway.payByCC(cardNumber, cvvString, expiry);

        return Long.parseLong(answer);
    }

    @Override
    public PaymentStatus getStatus(Long id) {
        boolean status = razorPayGateway.checkPaymentStatus(String.valueOf(id));
        if (status == true) {
            System.out.println("RazorPay's Transaction Success");
            return PaymentStatus.SUCCESS;
        } else {
            System.out.println("RazorPay's Transaction Failure");
            return PaymentStatus.FAILURE;
        }
    }
}
