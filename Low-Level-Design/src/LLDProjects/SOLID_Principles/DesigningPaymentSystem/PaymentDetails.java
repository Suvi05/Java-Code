package LLDProjects.SOLID_Principles.DesigningPaymentSystem;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public abstract class PaymentDetails {
    private String modeOfPayment;
    private Date dateOfTransaction;
    private double balance;
    private String sender;
    private String receiver;
    private TypeOfPayment type;

    public PaymentDetails(String modeOfPayment, Date dateOfTransaction, String sender, String receiver) {
        this.modeOfPayment = modeOfPayment;
        this.dateOfTransaction = dateOfTransaction;
        this.sender = sender;
        this.receiver = receiver;
    }

    @Override
    public String toString() {
        return "PaymentDetails{" + "modeOfPayment='" + modeOfPayment + '\'' + ", dateOfTransaction=" + dateOfTransaction + ", sender='" + sender + '\'' + ", receiver='" + receiver + '\'' + '}';
    }
}
