public class Main {
    public static void main(String[] args) {
        EventList2 eventList = new EventList2();
        ArrivalProcess2 arrivalProcess = new ArrivalProcess2();

        ServicePoint theServicePoint = new ServicePoint();

        SingletonClock theClock = SingletonClock.getInstance();

        int generateEvents = 10;

        for (int i = 0; i < generateEvents; i++) {
            arrivalProcess.createAnEvent(eventList);
            // System.out.println("The time: " + theClock.getTime());
        }

        eventList.displayEvents();
        System.out.println("\nThe time on the clock: " + theClock.getTime() + "\n");

        for (int i = 0; i < generateEvents; i++) {
            int customerArrivalTime = eventList.getNextEvent().getEventTime();
            Customer customer = new Customer();
            customer.setStartTime(customerArrivalTime);
            theServicePoint.addToQueue(customer);
        }

        theClock.setTime(theClock.getTime() + 5);
        System.out.println("\nThe time on the clock: " + theClock.getTime() + "\n");

        theServicePoint.serve();
    }
}
