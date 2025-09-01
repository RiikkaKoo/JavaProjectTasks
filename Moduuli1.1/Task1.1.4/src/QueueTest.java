import java.util.LinkedList;
import java.util.Scanner;

public class QueueTest {
    public static void main(String[] args) {

        LinkedList<Customer> customerQueue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        boolean stop = false;

        while (!stop) {

            System.out.println("\nCHOOSE AN ACTION: Queue a new customer (1), Dequeue a customer (2), stop (3): ");
            int action = scanner.nextInt();

            switch (action) {
                case 1:
                    Customer c = new Customer();
                    c.setStartTime(System.currentTimeMillis());
                    customerQueue.addFirst(c);
                    System.out.println("\nA new customer added to the queue.");
                    break;

                case 2:
                    if (!customerQueue.isEmpty()) {
                        Customer c2 = customerQueue.removeLast();
                        c2.setStopTime(System.currentTimeMillis());
                        System.out.println("\nCustomer " + c2.getId() + " removed from the queue.");
                        System.out.println("Customer " + c2.getId() + " spent " + c2.timeSpent() + " ms in the queue.");
                    } else {
                        System.out.println("\nThere are no customers in the queue.");
                    }
                    break;

                case 3:
                    stop = true;
                    break;
            }
        }

    }
}
