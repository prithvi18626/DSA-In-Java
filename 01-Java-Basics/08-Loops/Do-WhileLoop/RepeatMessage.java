import java.util.Scanner;

public class RepeatMessage {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    int num;
    do{
       System.out.println("Enter 1 to display the message");
       System.out.println("Enter 0 to exit ");

        num = scanner.nextInt();

        if (num == 1){
          System.out.println("Hello! Welcome to Java");
        }

        else if (num == 0){
          System.out.println("Program Ended");
          }
          else 
            System.out.println("Invalid input");

        }
        while(num != 0 && num !=1); 

    }
  }

