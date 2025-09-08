import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class EventList2 {

    PriorityQueue<Event> theQueue = new PriorityQueue<>();

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
        System.out.println("\nEVENTLIST: ");
        for (Event event : events) {
            System.out.printf("TYPE: " + event.getEventType() + "   | TIME: %2.0f"
                    + "\n", + (double)event.getEventTime());
        }
    }
}
