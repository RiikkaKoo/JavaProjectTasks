public class Event implements Comparable<Event> {

    private int eventTime;
    private String eventID;

    public Event(String eventType, int eventTime) {
        this.eventID = eventType;
        this.eventTime = eventTime;

    }

    public int getEventTime() {
        return eventTime;
    }

    public String getEventID() {
        return eventID;
    }

    public int compareTo(Event e) {
        if (e.eventTime < eventTime) { // Jos tämän eventin aika on suurempi kuin annetun (e) eventin aika...
            return 1;
        } else if (e.eventTime > eventTime) { // Jos tämän eventin aika on pienempi kuin annetun (e) eventin aika...
            return -1;
        } else {
            return 0;
        }
    }
}
