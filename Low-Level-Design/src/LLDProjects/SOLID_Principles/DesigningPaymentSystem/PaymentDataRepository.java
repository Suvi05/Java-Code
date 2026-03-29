package LLDProjects.SOLID_Principles.DesigningPaymentSystem;

import java.util.ArrayList;
import java.util.List;

public class PaymentDataRepository implements PaymentRepository {

    ArrayList<PaymentDetails> pdArray = new ArrayList<>();

    @Override
    public void save(PaymentDetails paymentDetails) {
        pdArray.add(paymentDetails);
    }

    @Override
    public PaymentDetails findByName(String senderName) {
        return pdArray.stream()
                .filter(pd -> pd.getSender().equals(senderName))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<PaymentDetails> findAll() {
        return pdArray;
    }
}
