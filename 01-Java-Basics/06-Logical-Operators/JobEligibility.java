import java.util.Scanner;

public class JobEligibility {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter programming experience in years: ");
        int experience = scanner.nextInt();

        System.out.print("Enter coding test score: ");
        double codingScore = scanner.nextDouble();

        if (age >= 18 && experience >= 2 && codingScore >= 60) {
            System.out.println("You are eligible for the job.");
        } else {
            System.out.println("You are not eligible for the job.");
        }

    }
}