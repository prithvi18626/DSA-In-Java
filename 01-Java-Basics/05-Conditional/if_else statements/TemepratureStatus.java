import java.util.Scanner;
public class TemepratureStatus {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the temprature");
    double tempt = scanner.nextDouble();

    if(tempt >= 30.0){
      System.out.println("Hot");
    }
    else
      System.out.println("Normal");

    int wholeTempt = (int)tempt;

    System.out.println("Original Temperature: "+tempt);
    System.out.println("Whole Temperature: "+wholeTempt);

  }
}
