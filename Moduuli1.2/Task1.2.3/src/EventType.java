// Two types of events: ARRIVAL and EXIT. They have their own constant IDs.

public enum EventType {
    ARRIVAL ("B1"),
    EXIT ("B3");

    private String eventID;

    EventType(String eventID) {
        this.eventID = eventID;
    }

    public String getEventID() {
        return eventID;
    }
}
