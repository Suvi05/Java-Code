package Lectures.DesingPatterns.BehaviouralDP.Observer.Normal;


public interface Subscriber {
    public void listen(Order order); //We are providing "order" information to the Subscriber
}
