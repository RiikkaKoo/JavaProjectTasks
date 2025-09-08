public class SingletonTest {
    public static void main(String[] args) {
        SingletonClock theClock = SingletonClock.getInstance();

        System.out.println("The time: " + theClock.getTime());
        theClock.setTime(13);
        System.out.println("The time: " + theClock.getTime());

        SingletonClock secondClock = SingletonClock.getInstance(); // Try to get a new clock
        System.out.println("The time: " + secondClock.getTime()); // The time of a new clock should be 0,
                                                               // but this shows the time that was set before, because this is the same instance.

    }
}
