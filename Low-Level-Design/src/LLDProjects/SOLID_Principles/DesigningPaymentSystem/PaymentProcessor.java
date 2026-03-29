package LLDProjects.SOLID_Principles.DesigningPaymentSystem;

public class PaymentProcessor {
    //This class will process the payment
    void pay(PaymentDetails details, double amount) {
        details.setBalance(details.getBalance() - amount);
    }

    void refund(PaymentDetails details, double amount) {
        details.setBalance(details.getBalance() + amount);
    }
}
