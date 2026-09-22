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

    int counter = 0;

    if(userName == correctUserName){  /*== compares whether two String references point to the same object.*/
      counter++;                      /*.equals() compares the actual text/content. */
    }
    if(password == correctPassword){
      counter++;
    }
    if(counter == 2){
      System.out.println("Login Successful");
    }
    else
      System.out.println("Invalid credentials");
      }
    } 


