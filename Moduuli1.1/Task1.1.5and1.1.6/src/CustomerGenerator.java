public class CustomerGenerator {
    public void createCustomers(ServicePoint servicePoint, int customers) {

        Customer.resetCount();

        for (int i = 0; i < customers; i++) {
            servicePoint.addToQueue(new Customer());
        }
    }
}
