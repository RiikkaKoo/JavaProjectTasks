import java.util.Scanner;

public class CustomerTester {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Customer c1 = new Customer();
        c1.setStartTime(System.currentTimeMillis());

        int spendTime = 0;
        System.out.println("Spend some time (Click enter until a message pops up)");
        while (spendTime < 12) {
            System.out.println(scanner.nextLine());
            spendTime++;
        }

        System.out.println("Time was spent!");

        Customer c2 = new Customer();
        c2.setStartTime(System.currentTimeMillis());

        spendTime = 0;
        System.out.println("Spend some more time (Click enter until an another message pops up)");
        while (spendTime < 17) {
            System.out.println(scanner.nextLine());
            spendTime++;
        }

        System.out.println("More time was spent!");

        c1.setStopTime(System.currentTimeMillis());
        c2.setStopTime(System.currentTimeMillis());

        System.out.println("Customer " + c1.getId() + ", Start time: "+ c1.getStartTime() + ", End time: "
                + c1.getEndTime() + ", Time spend: " + c1.timeSpent() + " ms");
        System.out.println("Customer " + c2.getId() + ", Start time: "+ c2.getStartTime() + ", End time: "
                + c2.getEndTime() + ", Time spend: " + c2.timeSpent() + " ms");
    }

}
