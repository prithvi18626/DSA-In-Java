import java.util.Scanner;

public class FreeDeliveryChecker{

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter order ammount");
    double orderAmount = scanner.nextDouble();

    System.out.println("Is location serviceable");
    boolean isServiceable = scanner.nextBoolean();

    if(orderAmount >= 500 && isServiceable == true){
      System.out.println("Free delivery available: true/ false");

    }
    else
      System.out.println("Delivery charges applicable75");
  }
}