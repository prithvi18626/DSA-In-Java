import java.util.Scanner;

public class NumberAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        
        if (num < 0) {
            System.out.println("The number is negative");
        }

        if (num > 0) {
            System.out.println("The number is positive");
        }

        if (num == 0) {
            System.out.println("The number is zero");
        }

        if (num >= -128 && num <= 127) {
            System.out.println("The number can be represented by a byte.");

            byte byteValue = (byte) num;

            System.out.println("Original number: " + num);
            System.out.println("Byte value: " + byteValue);
        }

        scanner.close();
    }
}