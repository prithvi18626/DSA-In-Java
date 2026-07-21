import java.util.Scanner;

public class StudentProfile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Full Name: ");
        String fullName = scanner.nextLine();

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter Branch: ");
        String branch = scanner.nextLine();

        System.out.print("Enter Roll Number: ");
        String rollNumber = scanner.nextLine();

        System.out.print("Enter CGPA: ");
        double cgpa = scanner.nextDouble();

        System.out.print("Enter Gender (M/F/O): ");
        char gender = scanner.next().charAt(0);

        System.out.println("\n----------- Student Profile -----------");
        System.out.println("Name        : " + fullName);
        System.out.println("Age         : " + age);
        System.out.println("Branch      : " + branch);
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("CGPA        : " + cgpa);
        System.out.println("Gender      : " + gender);
        System.out.println("---------------------------------------");

        double ageAsDouble = age;
        int cgpaAsInt = (int) cgpa;

        System.out.println("\n----- Type Casting -----");
        System.out.println("Age (int)      : " + age);
        System.out.println("Age (double)   : " + ageAsDouble);
        System.out.println("CGPA (double)  : " + cgpa);
        System.out.println("CGPA (int)     : " + cgpaAsInt);

        System.out.println("\n----- Part E Investigation -----");

        Scanner testScanner = new Scanner(System.in);

        System.out.print("Enter an Integer: ");
        int number = testScanner.nextInt();

        System.out.print("Enter a String: ");
        String text = testScanner.nextLine();

        System.out.println("Integer : " + number);
        System.out.println("String  : " + text);

        scanner.close();
        testScanner.close();
    }
}