import java.util.Scanner;

public class LoginValidator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String correctUserName = "admin";
    int correctPassword = 1234;

    System.out.println("Enter Username: ");
    String userName = scanner.nextLine();

    System.out.println("Enter password");
    int password = scanner.nextInt();

    if(userName == correctUserName){
      if(password = correctPassword){

      }
    } 
  }
}
