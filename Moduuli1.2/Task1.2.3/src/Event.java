public class Event implements Comparable<Event> {

    private int eventTime;;
    private EventType eventType; // EventType is an enum with eventID as a property

    public Event(int eventTime, EventType type) {
        this.eventTime = eventTime;
        this.eventType = type;
    }

    public int getEventTime() {
        return eventTime;
    }

    public String getEventID() {
        return eventType.getEventID(); // Get the ID from the enum with a method
    }

    public EventType getEventType() {
        return eventType; // This is the enum constant (ARRIVAL, EXIT)
    }

    public int compareTo(Event e) {
        if (e.eventTime < eventTime) {
            return 1;
        } else if (e.eventTime > eventTime) {
            return -1;
        } else {
            return 0;
        }
    }
}