import java.util.Scanner;
public class TemperatureWarning {
 public static void main(String[] args) {
  
  Scanner scanner = new Scanner(System.in);

  System.out.println("Enter Temperature");
  double temperature = scanner.nextDouble();

  if(temperature > 40)
    System.out.println("High Temperature Detected");

  int wholeTemperature = (int) temperature;
  System.out.println(wholeTemperature);
  
  scanner.close();
 } 
}
