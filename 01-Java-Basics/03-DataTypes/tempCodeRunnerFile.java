public class ImplicitTypeCasting {
  public static void main(String[] args){

    int age = 20;
    double studentAge = age;

    System.out.println(age);
    System.out.println(studentAge);

    byte attendance = 95;
    short totalAttendance;
    int yearlyAttendance;
    long completeAttendance;
    float attendancePercentage;
    double finalAttendance;

    totalAttendance =attendance;
    System.out.println(totalAttendance);

    yearlyAttendance = totalAttendance;
    System.out.println(yearlyAttendance);

    completeAttendance = yearlyAttendance;
    System.out.println(completeAttendance);

    attendancePercentage = completeAttendance;
    System.out.println(attendancePercentage);

    finalAttendance = attendancePercentage;
    System.out.println(finalAttendance);
    

    char grade = 'A';
    int score = grade;

    System.out.println(grade);
    System.out.println(score);


    int number = 65;

    int marks = 95;
    double result = marks;
    marks = -15;
    marks = 0;
    marks = 2147483647;
    
  }
}
