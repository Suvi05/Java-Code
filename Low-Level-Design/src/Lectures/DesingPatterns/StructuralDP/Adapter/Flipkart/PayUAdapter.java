package Lectures.DesingPatterns.StructuralDP.Adapter.Flipkart;

import Lectures.DesingPatterns.StructuralDP.Adapter.PayU.PayUGateway;

public class PayUAdapter implements PaymentGateway {

    private PayUGateway payUGateway = new PayUGateway();

    @Override
    public Long payViaCC(String cardNumber, int cvv, int expMonth, int expYear) {
        Long cnLong = Long.parseLong(cardNumber);
        Long cvvLong = (long) cvv;
        String expiry = String.valueOf(expMonth) + "/" + String.valueOf(expYear);
        String answer = payUGateway.makePaymentByCC(cnLong, cvvLong, expiry);
        return Long.parseLong(answer);
    }

    @Override
    public PaymentStatus getStatus(Long id) {
        boolean status = payUGateway.checkPaymentStatus(String.valueOf(id));
        if (status == true) {
            System.out.println("PayU's Transaction Success");
            return PaymentStatus.SUCCESS;
        } else {
            System.out.println("PayU's Transaction Failure");
            return PaymentStatus.FAILURE;
        }
    }
}