package Lectures.DesingPatterns.StructuralDP.Adapter.RazorPay;

public class RazorPayGateway {
    public String payByCC(String cc, String cvv, String expiry) {
        System.out.println("Payment method - Razor Pay");
        return "111";
    }

    public boolean checkPaymentStatus(String id) {
        if (id.equals("111")) {
            return true;
        } else {
            return false;
        }
    }
}
