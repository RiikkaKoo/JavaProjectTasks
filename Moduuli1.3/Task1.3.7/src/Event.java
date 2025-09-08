public class Event implements Comparable<Event> {

    private int eventTime;
    private EventType eventType;

    public Event(EventType type, int eventTime) {
        this.eventType = type;
        this.eventTime = eventTime;

    }

    public int getEventTime() {
        return eventTime;
    }

    public String getEventType() {
        return eventType.getEventID();
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
