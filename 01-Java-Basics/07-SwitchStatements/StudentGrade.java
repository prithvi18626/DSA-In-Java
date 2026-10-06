import java.util.Scanner;
public class StudentGrade {
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter Student Grade");
    char grade = scanner.next().charAt(0);

    switch (grade) {
      case 'A', 'a':
        System.out.println("A → Excellent");
        break;

      case 'B', 'b':
        System.out.println("B → Very Good");
        break;        
 
      case 'C', 'c':
        System.out.println("C → Good");
        break; 
        
      case 'D', 'd':
        System.out.println("D → Pass");
        break;    
        
      case 'F', 'f':
        System.out.println("F → Fail");
        break; 

      default:
      System.out.println("Invalid grade");

    }
  }
}
