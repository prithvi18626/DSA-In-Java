public class StudentMarks {

    public static void main(String[] args) {

        // Variables
        String studentName = "Prithvi";
        int maths = 88;
        int science = 91;
        int english = 79;

        // Total marks
        int total = maths + science + english;

        // Explicit Type Casting
        double percentage = (double) total / 3;

        // Implicit Type Casting
        double totalMarks = total;

        // Character and ASCII
        char grade = 'A';
        int asciiValue = grade;

        // Integer to Character
        int code = 66;
        char letter = (char) code;

        // Explicit Type Casting
        int roundedPercentage = (int) percentage;

        // Output
        System.out.println("----- Student Report -----");
        System.out.println("Name : " + studentName);
        System.out.println("Maths : " + maths);
        System.out.println("Science : " + science);
        System.out.println("English : " + english);

        System.out.println("\nTotal Marks (int) : " + total);
        System.out.println("Total Marks (double) : " + totalMarks);

        System.out.println("\nPercentage : " + percentage);
        System.out.println("Rounded Percentage : " + roundedPercentage);

        System.out.println("\nGrade : " + grade);
        System.out.println("ASCII Value of Grade : " + asciiValue);

        System.out.println("\nASCII Code : " + code);
        System.out.println("Character : " + letter);
    }
} 
