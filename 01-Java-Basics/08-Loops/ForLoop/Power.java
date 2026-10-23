import java.util.Scanner;

class Power{

  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a number:");
    int a = scanner.nextInt();

    System.out.println("Enter the power: ");
    int b = scanner.nextInt();

    int pow = 1;

    for(int i = 1; i <= b; i++){
      pow = pow * a;

    }
    System.out.println( "a to the power b is " +pow);

  }
}