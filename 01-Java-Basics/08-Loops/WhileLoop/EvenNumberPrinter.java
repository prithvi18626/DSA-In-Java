import java.util.Scanner;

public class EvenNumberPrinter {
 
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter limit: ");
    int num = scanner.nextInt();

    while(num > 0){
    if (num % 2 == 0){
      System.out.println(num);
      num = num - 2; 
    }
    

    }

  }
}
