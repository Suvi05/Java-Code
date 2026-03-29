package LLDProjects.SOLID_Principles.DesigningPaymentSystem;

public class Crypto extends PaymentDetails implements Payment {
    public Crypto(String modeOfPayment, java.util.Date dateOfTransaction, String sender, String receiver) {
        super(modeOfPayment, dateOfTransaction, sender, receiver);
    }

    @Override
    public void processPayment() {
        System.out.println("Payment done via Crypto");
    }
}
