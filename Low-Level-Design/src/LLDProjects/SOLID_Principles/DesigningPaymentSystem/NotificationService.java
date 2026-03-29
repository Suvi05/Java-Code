package LLDProjects.SOLID_Principles.DesigningPaymentSystem;

public class NotificationService {
    void email(String modeOfPayment, TypeOfPayment type) {
        System.out.println("Email sent for " + modeOfPayment + " & Type of Transaction is " + type);
    }

    void sms(String modeOfPayment, TypeOfPayment type) {
        System.out.println("SMS sent for " + modeOfPayment + " & Type of Transaction is " + type);
    }
}
