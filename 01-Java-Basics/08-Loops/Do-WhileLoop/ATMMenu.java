import java.util.Scanner;

public class ATMMenu {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double balance = 10000;
        int choice = 0;

        while (choice != 4) {

            System.out.println("\n===== ATM =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");

            System.out.print("Make a choice: ");
            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Current Balance: ₹" + balance);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    double deposit = scanner.nextDouble();

                    if (deposit > 0) {
                        balance = balance + deposit;
                        System.out.println("Deposit successful.");
                        System.out.println("Updated Balance: ₹" + balance);
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }

                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawal = scanner.nextDouble();

                    if (withdrawal > 0 && withdrawal <= balance) {

                        balance = balance - withdrawal;

                        System.out.println("Withdrawal successful.");
                        System.out.println("Updated Balance: ₹" + balance);

                    } else {
                        System.out.println("Invalid withdrawal amount.");
                    }

                    break;

                case 4:
                    System.out.println("Thank you for using the ATM.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }
}