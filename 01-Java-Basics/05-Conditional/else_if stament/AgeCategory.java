import java.util.Scanner;

public class AgeCategory {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter age");
    int age = scanner.nextInt();

    if(age >= 0 && age <= 12){
      System.out.println("Child");

    }
    else if(age >= 13 && age <= 17){
      System.out.println("Teenager");

    }
    else if(age >= 18 && age <= 59){
      System.out.println("Adult");

    }
    else
      System.out.println("Senior Citizen");
  }
}
