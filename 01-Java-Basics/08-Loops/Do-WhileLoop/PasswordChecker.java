
import java.util.Scanner;

public class PasswordChecker {
 
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    int correctpin = 1234;
    int pin;

    do{
    System.out.println("Enter PIN: ");
    pin = scanner.nextInt();

    if (pin == correctpin){
      System.out.println("Access granted");

    }

    else if (pin != correctpin){
      System.out.println("Incorrect Pin");

    }
    else{
      System.out.println("Invalid input");
    }
    
    }

    while(pin != correctpin);


  }
}
