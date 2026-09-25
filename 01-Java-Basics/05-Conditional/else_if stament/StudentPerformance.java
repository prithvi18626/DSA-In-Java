import java.util.Scanner;

public class StudentPerformance {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter Student name ");
    String name = scanner.nextLine();

    System.out.println("Enter Mathematics marks");
    double maths = scanner.nextDouble();

    System.out.println("Enter Programming marks");
    double programming = scanner.nextDouble();

    System.out.println("Enter DBMS marks");
    double dbms = scanner.nextDouble();

    double total = maths + programming + dbms;
    System.out.println("Total: "+total);

    double average = total / 3;
    System.out.println("Average: "+average);

    if(average >= 75){
      System.out.println("Distinction");

    }
    else if(average >= 60){
      System.out.println("First Class");

    }
    else if(average >= 50){
      System.out.println("Second Class");

    }
    else if(average >= 40){
      System.out.println("Pass");

    }
    else
      System.out.println("Fail");

    int counter = 0;
     if(maths >= 40)
      counter++;

     if(programming >= 40)
      counter++;

     if(dbms >= 40)
      counter++;

     if(counter == 3){
      System.out.println("The student passed all three subject");
     }
     else
      System.out.println("The student did not passed all three subject");

  }
}
