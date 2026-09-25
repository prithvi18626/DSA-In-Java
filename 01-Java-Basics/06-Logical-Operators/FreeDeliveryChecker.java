import java.util.Scanner;

public class FreeDeliveryChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter order amount: ");
        double orderAmount = scanner.nextDouble();

        System.out.print("Is location serviceable (true/false): ");
        boolean isServiceable = scanner.nextBoolean();

        if (orderAmount >= 500 && isServiceable) {
            System.out.println("Free delivery available.");
        } else {
            System.out.println("Delivery charges applicable.");
        }

        scanner.close();
    }
}