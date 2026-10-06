import java.util.Scanner;

public class MenuSystem {

  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    System.out.println("===== Menu ====");
    System.out.println("1. Pizza      - ₹250");
    System.out.println("2. Burger     - ₹150");
    System.out.println("3. Sandwich   - ₹100");
    System.out.println("4. Coffee     - ₹80");
    System.out.println("5. Exit");
    
    System.out.println("Enter your choice: ");
    int choice = scanner.nextInt();

    switch(choice){
      case 1:
        System.out.println("You Selected: Pizza");
        System.out.println("Price: ₹250");
        break;

      case 2:
        System.out.println("You Selected: Burger");
        System.out.println("Price: ₹150");
        break;        

      case 3:
        System.out.println("You Selected: Sandwich");
        System.out.println("Price: ₹100");
        break;  
        
      case 4:
        System.out.println("You Selected: Coffee");
        System.out.println("Price: ₹80");
        break;
        
      case 5:
        System.out.println("Thank you for visiting");
        break;        

      default:
        System.out.println("Invalid choice");  
    }


  }
  
}
