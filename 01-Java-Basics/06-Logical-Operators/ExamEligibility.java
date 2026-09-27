import java.util.Scanner;

public class ExamEligibility {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter attendance percentage: ");
        double attendance = scanner.nextDouble();

        System.out.print("Enter internal marks: ");
        int internalMarks = scanner.nextInt();

        int wholeAttendance = (int) attendance;

        if (attendance >= 75 && internalMarks >= 40) {
            System.out.println("Eligible for examination.");
        } else {
            System.out.println("Not eligible for examination.");
        }

        System.out.println("Original attendance: " + attendance);
        System.out.println("Whole attendance: " + wholeAttendance);


    }
}