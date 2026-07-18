public class TypeCastingFInalChallenge {
  public static void main(String[] args) {
    
    int distance = 1000;
    System.out.println(distance);

    double distance1 = distance;
    System.out.println(distance1);  //This conversion is automatic besacuse it lies under implicit conversion 

    double temperature = 33.33;
    System.out.println(temperature);

    int temprature1 = (int) temperature;
    System.out.println(temprature1);  // info after the decimal point is lost

    int num1 = 65;
    int num2 = 90;
    int num3 = 97;
    int num4 = 122;
    System.out.println(num1 + " " + num2 + " " + num3 + " " + num4);

    char letter1 = (char) num1;
    char letter2 = (char) num2;
    char letter3 = (char) num3;
    char letter4 = (char) num4;
    System.out.println(letter1 + " " + letter2 + " " + letter3 + " " + letter4);

    int value = 260;
    byte b = (byte) value;
    System.out.println(value);
    
  }
}
