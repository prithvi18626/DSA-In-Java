public class HourstoMinutes {
  public static void main(String[] args){

    int hours = 10;
    int minutesPerHour = 60;

    int totalMinutes = hours * minutesPerHour;
    int totalSeconds = hours * minutesPerHour * 60; 
    
    System.out.println("10 hours = " + totalMinutes + " minutes " +"and "+totalSeconds+ " seconds");
    
  }
}
