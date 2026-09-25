import java.util.Scanner;

public class NumberAnalyzerV2 {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a number: ");
    int num = scanner.nextInt();

    if(num < 0){
      System.out.println("Negative");

    }
    else if(num == 0){
      System.out.println("Zero");
    }
    else{
      System.out.println("Positive");

    if(num >= 501){
      System.out.println("Large Positive");

    }
    else if(num >= 51){
      System.out.println("Medium Positive");

    }
    else {
      System.out.println("Small Positive");
      
    }

}
}
}