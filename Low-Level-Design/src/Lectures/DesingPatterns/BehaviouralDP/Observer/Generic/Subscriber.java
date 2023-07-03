package Lectures.DesingPatterns.BehaviouralDP.Observer.Generic;


public interface Subscriber<T> {
    //T- So that all the events could be called by it:
    //One class may be interested in Order, another may be in invoice etc.
    public void listen(Events events, T order);
    //We are providing "order" information to the Subscriber, for this particular "event"
}
