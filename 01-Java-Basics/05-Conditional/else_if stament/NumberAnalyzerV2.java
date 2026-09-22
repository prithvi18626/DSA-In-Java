import java.util.Scanner;

public class NumberAnalyzerV2 {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a number: ");
    int num = scanner.nextInt();

    if(num <= 0){
      System.out.println("Negative");

    }
    else if(num >= 0){
      System.out.println("Positive");
    }
    else
      System.out.println("Zero");

    

}
}
