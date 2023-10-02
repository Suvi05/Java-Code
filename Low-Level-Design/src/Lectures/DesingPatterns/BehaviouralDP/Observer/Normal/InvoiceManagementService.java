package Lectures.DesingPatterns.BehaviouralDP.Observer.Normal;


//This is one of the Subscriber
public class InvoiceManagementService implements Subscriber {

    //Registering Observer as a Subscriber
    InvoiceManagementService() { //Constructor
        Flipkart.registerSubscriber(Events.ORDER_PLACED, this);
        //this -> because it is himself a subscriber.
        //Registering Subscriber in Constructor b/c IMS will always be interested in ORDER_PLACED Event
    }

    //This method will call Generate Invoice Method
    @Override
    public void listen(Order order) {
        generateInvoice(order);
    }

    //Invoice Management System might be need to Generate Invoice when order gets placed
    public void generateInvoice(Order order) {
        System.out.println("Generating Invoice for the Order");// + order.toString()
    }
}
