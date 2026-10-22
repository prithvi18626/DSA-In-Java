import java.util.Scanner;

public class SumOfDigit {
  public static void main(String[] args) {
   
    Scanner scanner = new Scanner(System.in);

    System.out.println("Eneter a number ");
    int n = scanner.nextInt();
    
    int sum = 0;

    if(n < 0){
      n = -n;
    }

    while(n > 0){
      int rem = n % 10;

      sum = sum + rem;
      n = n/10;

    }
    System.out.println("The sum of digits is " + sum);
  }
}
