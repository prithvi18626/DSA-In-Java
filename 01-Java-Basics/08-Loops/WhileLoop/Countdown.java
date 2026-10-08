import java.util.Scanner;

public class Countdown {
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter starting number: ");
    int num = scanner.nextInt();

    while(num > 0){
      System.out.println(num);
      num--;
      // if(num == 0){
      //   System.out.println("Blast off!");
      }
      if(num == 0){
        System.out.println("Blast off!");
    }
  }
}
