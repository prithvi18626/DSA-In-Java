import java.util.Scanner;

public class PassOrFail {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter student marks");
    int marks = scanner.nextInt();

    if(marks>= 40){
      System.out.println("Pass");
    }

    else
      System.out.println("Fail");

    double marks1 = marks;
    System.out.println("Marks in double datatype " +marks1);


  }
  
}
