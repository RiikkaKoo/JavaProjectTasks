public class Customer {

    private static int count = 0;

    private int id;
    private long startTime;
    private long stopTime;

    public Customer() {
        count++;
        this.id = count;
    }

    public int getId() {
        return id;
    }

    public static void resetCount() {
        count = 0;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return stopTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public void setStopTime(long stopTime) {
        this.stopTime = stopTime;
    }

    public long timeSpent() {
        return this.stopTime -this.startTime;
    }
}
