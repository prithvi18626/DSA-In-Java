import java.util.Scanner;

public class AgeCategory {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter age:");
        int age = scanner.nextInt();

        if (age < 0) {
            System.out.println("Invalid age");
        }
        else if (age >= 60) {
            System.out.println("Senior Citizen");
        }
        else if (age >= 18) {
            System.out.println("Adult");
        }
        else if (age >= 13) {
            System.out.println("Teenager");
        }
        else {
            System.out.println("Child");
        }

        scanner.close();
    }
}