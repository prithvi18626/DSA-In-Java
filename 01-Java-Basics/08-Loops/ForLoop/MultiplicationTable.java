import java.util.Scanner;
public class MultiplicationTable {
 public static void main(String[] args) {
  
  Scanner scanner = new Scanner(System.in);

  System.out.println("Enter a number: ");
  int num = scanner.nextInt();

  int multiplication = 0;
  int multiplicant = 1;

  for(multiplicant = 1; multiplicant <= 10; multiplicant++){
     multiplication = num * multiplicant; 
  System.out.println(num + " x " + multiplicant + " = " + multiplication); 
 } 
}
}
