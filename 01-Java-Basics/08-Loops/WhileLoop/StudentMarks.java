import java.util.Scanner;

public class StudentMarks {
  
  public static void main(String[] args) {
    
    Scanner scanner  = new Scanner(System.in);

    int subject = 1;
    int total = 0;
    int passedSubjects = 0;

    while (subject <=5){
      System.out.println("Enter marks for subject " + subject + ":");
      int marks = scanner.nextInt();

      total = total + marks;

      if (marks >=40){
        passedSubjects++;
      }
      subject++;
    }

    double average = (double) total / 5;

    System.out.println("Total Marks: " + total);
    System.out.println("Average: " + average);
    System.out.println("Subject Passed: " + passedSubjects);
    
  }
}
