import java.util.Scanner;

public class TemperatureStatus {
  
  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);

  System.out.println("Enter temperature");
  double temperature = scanner.nextDouble();

  if(temperature >= 40){
    System.out.println("Extremely Hot");

  }
  else if(temperature >= 30){
    System.out.println("Hot");

  }
  else if(temperature >= 20){
    System.out.println("Normal");

  }
  else if(temperature >= 10){
    System.out.println("Cool");
  }
  else
    System.out.println("Cold");

  int temperature1 = (int)temperature;
  System.out.print("The original temperature is "+temperature);
  System.out.print(" and the temperature in whole number is "+temperature1);
  }

}
