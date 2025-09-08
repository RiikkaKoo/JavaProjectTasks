public class SingletonClock {
    private static SingletonClock clock;
    private double time;

    private SingletonClock() {
        this.time = 0;
    }

    public static SingletonClock getInstance() {
        if (clock == null) {
            clock = new SingletonClock();
        }
        return clock;
    }

    public double getTime() {
        return this.time;
    }

    public void setTime(double time) {
        this.time = time;
    }
}
