import java.util.Scanner;

public class StudentMarks {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    double total = 0;
    double average = 0;
    int passedSubject = 0;
    int subject;

    for(subject = 1; subject <= 5; subject++){

      switch (subject){
        case 1:
          System.out.print("Enter DBMS marks: ");
          break;

        case 2:
          System.out.print("Enter Software Engineering marks: ");
          break;

        case 3:
          System.out.print("Enter Cyber Security marks: ");
          break;
          
        case 4:
          System.out.print("Enter IOT makrs: ");  
          break;

        case 5:
          System.out.print("Enter Theory of Computation makrs: ");
          break;  
      } 

      int marks = scanner.nextInt();


      total = marks + total;
      
      if(marks >= 40){
        passedSubject++;
      }

    }
    average = total / 5;

    System.out.println("Total Marks: " + total);
    System.out.println("Average Marks: " + average);
    System.out.println("Subject Passed: " + passedSubject);
  }
}
