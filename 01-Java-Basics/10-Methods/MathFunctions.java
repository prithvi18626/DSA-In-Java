public class MathFunctions {

    public static void main(String[] args) {

        double a = 25.0;
        double b = 4.0;
        double number = 5.7;

        // 1. Maximum
        System.out.println("Maximum: " + Math.max(a, b));

        // 2. Minimum
        System.out.println("Minimum: " + Math.min(a, b));

        // 3. Square Root
        System.out.println("Square Root: " + Math.sqrt(a));

        // 4. Power
        System.out.println("Power (5^3): " + Math.pow(5, 3));

        // 5. Cube Root
        System.out.println("Cube Root: " + Math.cbrt(27));

        // 6. Round
        System.out.println("Round: " + Math.round(number));

        // 7. Ceiling
        System.out.println("Ceiling: " + Math.ceil(number));

        // 8. Floor
        System.out.println("Floor: " + Math.floor(number));
    }
}
```
