import java.util.ArrayList;

public class ArrivalProcessMain {
    public static void main(String[] args) {
        ArrayList<Event> eventList = new ArrayList<>();
        ArrivalProcess arrivalProcess = new ArrivalProcess();

        SingletonClock theClock = SingletonClock.getInstance();
        System.out.println("The time: " + theClock.getTime());

        int generateEvents = 10;

        for (int i = 0; i < generateEvents; i++) {
            arrivalProcess.createAnEvent(eventList);
            // System.out.println("The time: " + theClock.getTime());
        }
        System.out.println("\nEvent type:   |   Time: \n-----------------------------");
        for (Event e : eventList) {
            System.out.println(e.getEventType() + "       |    " + e.getEventTime());
        }
    }
}
