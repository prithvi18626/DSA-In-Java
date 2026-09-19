import java.util.Scanner;
public class EmployeeBonusEligibility {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter Employee Name: ");
    String empName =  scanner.nextLine();

    System.out.println("Enter Employee Age: ");
    int empAge = scanner.nextInt();

    System.out.println("Enter Employee Salary: ");
    double empSalary = scanner.nextDouble();

    System.out.println("Enter Employee Performance Score");
    double empPerformanceScore = scanner.nextDouble();

    System.out.println("Enter Employee Experience ");
    int empExperience = scanner.nextInt();

    if(empExperience >= 3)
      System.out.println("Experience requirement satisfied");

    if(empPerformanceScore >=8)
    System.out.println("Performance requirement satified");

    if(empSalary < 1000000)
      System.out.println("Salary falls within the bonus eligiblity limit");

    if(empAge >=20)
      System.out.println("Age requirement is satisfied");
    
    int performanceScore =(int)empPerformanceScore;
    System.out.println("performance Entered: "+empPerformanceScore);
    System.out.println("Performance as integer: "+performanceScore);
  }
}
