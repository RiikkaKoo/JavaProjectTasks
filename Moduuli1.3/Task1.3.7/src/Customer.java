public class Customer {

    private static int count = 0;

    private int id;
    private int startTime;
    private int stopTime;

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

    public int getStartTime() {
        return startTime;
    }

    public int getEndTime() {
        return stopTime;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public void setStopTime(int stopTime) {
        this.stopTime = stopTime;
    }

    public int timeSpent() {
        return this.stopTime -this.startTime;
    }
}
