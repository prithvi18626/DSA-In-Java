import java.util.Scanner;

public class DecreasingLoop {
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a number: ");
    int n = scanner.nextInt();

    for (int i = n; i >= 1; i--){
      System.out.println(i);
    }
  }
}
