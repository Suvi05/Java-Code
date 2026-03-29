package LLDProjects.SOLID_Principles.DesigningPaymentSystem;

import java.util.Date;

public class UPI extends PaymentDetails implements Payment, PaymentRefund {
    public UPI(String modeOfPayment, Date dateOfTransaction, String sender, String receiver) {
        super(modeOfPayment, dateOfTransaction, sender, receiver);
    }

    @Override
    public void processPayment() {
        System.out.println("Payment done via UPI");
    }

    @Override
    public void refund() {
        System.out.println("Payment refunded via UPI");
    }
}
