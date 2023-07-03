package Lectures.DesingPatterns.StructuralDP.Adapter.Flipkart;

public class Client {
    public static void main(String[] args) {
        Flipkart flipkart = new Flipkart(new RazorPayAdapter());//Dependency Injection
        flipkart.makePaymentViaCC("1010", 333, 12, 2025);
    }
}
