package LLDProjects.SOLID_Principles.DesigningPaymentSystem;

public class CreditCard extends PaymentDetails implements Payment, PaymentRefund {
    public CreditCard(String modeOfPayment, java.util.Date dateOfTransaction, String sender, String receiver) {
        super(modeOfPayment, dateOfTransaction, sender, receiver);
    }

    @Override
    public void processPayment() {
        System.out.println("Payment Done via Credit Card");
    }

    @Override
    public void refund() {
        System.out.println("Refunded via Credit Card");
    }
}
