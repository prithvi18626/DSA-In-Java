import java.util.Scanner;

public class ATMWithdrawal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account balance: ");
        double balance = scanner.nextDouble();

        System.out.print("Enter withdrawal amount: ");
        double withdrawalAmount = scanner.nextDouble();

        if (withdrawalAmount > 0 && withdrawalAmount <= balance) {

            double remainingBalance = balance - withdrawalAmount;

            System.out.println("Withdrawal successful.");
            System.out.println("Remaining balance: " + remainingBalance);

        } else {
            System.out.println("Invalid withdrawal amount.");
        }

        scanner.close();
    }
}