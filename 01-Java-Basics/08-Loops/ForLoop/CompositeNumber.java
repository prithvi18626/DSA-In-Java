import java.util.Scanner;

public class CompositeNumber {

  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a number: ");
    int n = scanner.nextInt();

    boolean flag = true;

    for (int i = 2; i <= n/2; i++){
      if(n % i == 0){
        flag = false;
        break;
      } 
    }if (n == 1){
      System.out.println("Neither Prime nor Composite");
    }

    else if(flag == false){
      System.out.println("Composite number");

      if(flag == true){
        System.out.println("Prime number");
      }
    }
  }   
  
}
