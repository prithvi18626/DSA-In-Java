import java.util.Scanner;

public class Factorial {
 
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner (System.in);

    System.out.print("Enter a number: ");
    int n = scanner.nextInt();

    int fact = 1;

    while(n != 1){
      fact = n * fact;

      n--;
      

    }

    System.out.println(fact);

  }
}
