import eduni.distributions.Normal;

public class ArrivalProcess2 {
    private EventType eventType = EventType.ARRIVAL;
    private Normal numberGen = new Normal(5, 3); // Normal distribution: mean value 5, variance 3

    public void createAnEvent(EventList2 evenList) {
        int randomNum = (int) numberGen.sample();
        // System.out.println(randomNum); // To check that the random number generator is working.
        int arrivalTime = (int) SingletonClock.getInstance().getTime() + randomNum; // Create a new arrival time

        SingletonClock.getInstance().setTime(arrivalTime);

        evenList.addEvent(new Event(this.eventType, arrivalTime));
        System.out.println("New \"" + this.eventType + "\" event created.");
    }
}
