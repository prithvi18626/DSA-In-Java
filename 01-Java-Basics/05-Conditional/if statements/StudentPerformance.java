import java.util.Scanner;

public class StudentPerformance {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter Student Name: ");
    String name  = scanner.nextLine();

    System.out.println("Enter Mathematics Marks:  ");
    double mathematics = scanner.nextDouble();

    System.out.println("Enter Programming Marks: ");
    double programming = scanner.nextDouble();

    System.out.println("Enter DBMS Marks: ");
    double dbms = scanner.nextDouble();

    double totalMarks = mathematics + programming + dbms;
    System.out.println("Total Marks = " +totalMarks);

    double averageMarks = (mathematics + programming + dbms)/3;
    System.out.println("Average Marks = " +averageMarks);

    if(averageMarks >= 75)
      System.out.println("Student Qualifies for Distinction");

    int passedSubject = 0;

    if(mathematics >= 40){
      passedSubject++;
    }

    if(programming >= 40){
      passedSubject++;
    }

    if(dbms >= 40){
      passedSubject++;
    }

    if(passedSubject == 3){
      System.out.println("Student has passed all the Subjects ");
    }

   
    
  }
}
