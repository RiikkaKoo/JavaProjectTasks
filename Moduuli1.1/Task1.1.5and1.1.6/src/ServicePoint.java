import java.util.LinkedList;

public class ServicePoint {

    private LinkedList<Customer> theCustomerQueue = new LinkedList<>();
    private long serviceTimeSum = 0;
    private long averageServiceTime = 0;
    private int customersInQueue = 0;

    public void addToQueue(Customer a) {
        a.setStartTime(System.currentTimeMillis());
        theCustomerQueue.addFirst(a);
        customersInQueue++;
        System.out.println("CUSTOMER " + a.getId() + " ADDED TO THE QUEUE");
    }

    private Customer removeFromQueue() {
        return theCustomerQueue.removeLast();
    }

    public long getAverageServiceTime() {
        return averageServiceTime;
    }

    public void serve() {
        while (!theCustomerQueue.isEmpty()) {

            Customer c = removeFromQueue();
            System.out.println("\nCustomer " + c.getId() + " removed from the queue.");

            long serviceTime = (long)(Math.floor(Math.random() * (8000 - 3000 + 1) + 3000));
            serviceTimeSum += serviceTime;

            System.out.println("IN SERVICE...");

            try {
                Thread.sleep(serviceTime);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            c.setStopTime(System.currentTimeMillis());

            System.out.println("\nCUSTOMER " + c.getId() + " TIME INFO:\nWaiting time: " + (c.timeSpent() - serviceTime)
                    + " ms \nService time: " + serviceTime + " ms \nResponse time: " + c.timeSpent() + " ms\n\n-----------------------------------");
        }
        System.out.println("\nALL CUSTOMERS SERVED");
        averageServiceTime = serviceTimeSum/customersInQueue;
    }
}
