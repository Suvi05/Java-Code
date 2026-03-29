package LLDProjects.SOLID_Principles.DesigningPaymentSystem;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Payment System");

        // 1. Services banao
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        PaymentDataRepository paymentRepository = new PaymentDataRepository();
        NotificationService notificationService = new NotificationService();
        PaymentReportService paymentReportService = new PaymentReportService(paymentRepository);

        // 2. Payment objects banao (ye PaymentDetails bhi hain)
        UPI upi = new UPI("UPI", new java.util.Date(), "Alice", "Bob");
        upi.setBalance(1000);

        CreditCard creditCard = new CreditCard("CreditCard", new java.util.Date(), "Charlie", "Dave");
        creditCard.setBalance(2000);

        // 3. UPI payment flow
        upi.processPayment();
        paymentProcessor.pay(upi, 500);
        paymentRepository.save(upi);
        notificationService.email(upi.getModeOfPayment(), TypeOfPayment.PAY);

        // 4. CreditCard refund flow
        creditCard.refund();
        paymentProcessor.refund(creditCard, 200);
        paymentRepository.save(creditCard);
        notificationService.sms(creditCard.getModeOfPayment(), TypeOfPayment.REFUND);

        // 5. Report
        paymentReportService.generateReport();
    }
}
