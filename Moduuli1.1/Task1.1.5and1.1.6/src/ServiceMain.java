public class ServiceMain {
    public static void main(String[] args) {

        long avgServiceTimeSum = 0;
        int runs = 4;

        for (int i = 0; i < runs; i++) {

            System.out.println("\n>>>>>>  RUN " + (i + 1) + "  <<<<<<");

            ServicePoint theServicePoint = new ServicePoint();
            CustomerGenerator cGenerator = new CustomerGenerator();

            cGenerator.createCustomers(theServicePoint, 5);
            theServicePoint.serve();

            System.out.println("The average service time was " + theServicePoint.getAverageServiceTime()
                    + " ms.\n\nVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV");
            avgServiceTimeSum += theServicePoint.getAverageServiceTime();
        }
        System.out.println("\nTHE AVERAGE SERVICE TIME OF ALL THE RUNS IS " + (avgServiceTimeSum/runs) + " ms.");
    }
}
