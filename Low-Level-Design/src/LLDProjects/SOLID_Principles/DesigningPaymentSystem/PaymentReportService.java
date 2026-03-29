package LLDProjects.SOLID_Principles.DesigningPaymentSystem;

import java.util.List;

public class PaymentReportService {
    //This will keep the track of processed payments.
    PaymentRepository paymentRepository;

    PaymentReportService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    void generateReport() {
        List<PaymentDetails> reportArray = paymentRepository.findAll();
        for (PaymentDetails payment : reportArray) {
            System.out.println(payment);
        }
    }
}
