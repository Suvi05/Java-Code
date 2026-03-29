package LLDProjects.SOLID_Principles.DesigningPaymentSystem;

import java.util.List;

public interface PaymentRepository {
    void save(PaymentDetails paymentDetails);

    PaymentDetails findByName(String senderName);

    List<PaymentDetails> findAll();
}
