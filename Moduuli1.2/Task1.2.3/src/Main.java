public class Main {
    public static void main(String[] args) {

        EventList eventList = new EventList();

        for (int i = 0; i < 3; i++) {
            eventList.addEvent(new Event((int) (Math.random() * 15 + 1), EventType.ARRIVAL)); // Generate ARRIVAL event with random clock time
            eventList.addEvent(new Event( (int) (Math.random() * 10 + 1), EventType.EXIT)); // Generate EXIT event with random clock time
        }

        eventList.displayEvents();

        eventList.getNextEvent();
        System.out.println("\nThe first event removed from the list.\n");

        eventList.displayEvents();
    }
}

