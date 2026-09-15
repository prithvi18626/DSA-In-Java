import java.util.Scanner;

public class AgeEligiblity {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter Age: ");
    int age = scanner.nextInt(); 

    if (age >= 18)
      System.out.println("An Adult");

    scanner.close();  //must close the scanner class
    
  }
}

