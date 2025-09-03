public class Main {
    public static void main(String[] args) {

        EventList eventList = new EventList();

        for (int i = 0; i < 10; i++) {
            eventList.addEvent(new Event("B" + (int) (Math.random() * 5 + 1), (int) (Math.random() * 15 + 1)));
        }

        eventList.displayEvents();

        eventList.getNextEvent();
        System.out.println("\nThe first event removed from the list.\n");

        eventList.displayEvents();
    }
}

