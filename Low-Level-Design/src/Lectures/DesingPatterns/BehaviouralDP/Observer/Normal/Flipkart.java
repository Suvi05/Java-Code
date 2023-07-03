package Lectures.DesingPatterns.BehaviouralDP.Observer.Normal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Producer Class
public class Flipkart {

    public void placeOrder(Order order) {  //This is an interesting event, to which other Classes want to know
        this.notify(Events.ORDER_PLACED, order);
        //And notify(Events.ORDER_PLACED,order); both are same
    }

    //This will store that for that particular event these are the Subscribers.
    private static Map<Events, List<Subscriber>> subscribers = new HashMap<>();

    //Flipkart will have some methods to take care of its Subscribers
    public static void registerSubscriber(Events events, Subscriber subscriber) {
        //It means Subscriber want to register for this Event

        //Below code : If any event is not present then put that event as KEY and put an empty array so that we can add subscribers later.
        //         Key        Value
        //    ORDER_PLACED     [].add()

        if (!subscribers.containsKey(events)) {
            subscribers.put(events, new ArrayList<>());
        }

        //If we already have that list then we will add new subscriber to it:
        //Means this "subscriber" is interested in this "events"
        subscribers.get(events).add(subscriber);
    }

    //This will be called whenever this event will occur and this will notify all the subscriber of this event.
    public void notify(Events events, Order order) {
        for (Subscriber subscriber : subscribers.get(events)) {
            subscriber.listen(order); //This method is in Subscriber Interface
        }
    }
}

//So, Producer will have 2 methods:
//1- So that people can subscribe to you -registerSubscriber()
//2- So that you can Notify the people who has subscribed -notify()