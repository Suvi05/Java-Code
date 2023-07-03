package Lectures.DesingPatterns.BehaviouralDP.Observer.Generic;


//This is one of the Subscriber
public class InvoiceManagementService implements Subscriber<Order> {
    //Here IMS is subscribing for Order event

    //Registering Observer as a Subscriber
    InvoiceManagementService() {
        Flipkart.registerSubscriber(Events.ORDER_PLACED, this);
        //this -> because it is himself a subscriber.
        Flipkart.registerSubscriber(Events.ORDER_CANCELLED, this);
    }

    //This method will call Generate Invoice Method
    @Override
    public void listen(Events events, Order order) {

        if (events == Events.ORDER_PLACED) {
            generateInvoice(order);
        } else {
            cancelInvoice(order);
        }
    }

    //Invoice Management System might be need to Generate Invoice when order gets placed
    public void generateInvoice(Order order) {
        System.out.println("Generating Invoice for the Order");// + order.toString()
    }

    public void cancelInvoice(Order order) {
        System.out.println("Cancelling Invoice for the Order");
    }
}
