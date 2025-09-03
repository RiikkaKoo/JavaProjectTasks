import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class EventList {

    PriorityQueue<Event> theQueue = new PriorityQueue<>(); // The queue with events

    public void addEvent(Event e) {
        theQueue.add(e);
    }

    public Event getNextEvent() {
        return theQueue.poll();
    }

    public PriorityQueue<Event> getTheQueue() {
        return theQueue;
    }

    public void displayEvents() {
        ArrayList<Event> events = new ArrayList<>();
        for (Event e : theQueue) {
            events.add(e);
        }
        Collections.sort(events);
        System.out.println("EVENTLIST: ");
        for (Event event : events) {
            System.out.printf("ID: " + event.getEventID() + "   | TIME: %2.0f"
                    + "   | TYPE: " + event.getEventType().toString().toLowerCase() + "\n", +(double) event.getEventTime());
        }
    }
}
