package Lectures.DesingPatterns.StructuralDP.Adapter.PayU;

public class PayUGateway {

    public String makePaymentByCC(Long cc, Long cvv, String expiry) {
        System.out.println("Payment method - PayU");
        return "222";
    }

    public boolean checkPaymentStatus(String id) {
        if (id.equals("222")) {
            return true;
        } else {
            return false;
        }
    }
}
