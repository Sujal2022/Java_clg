public class ExceptionExample {

    public static void main(String[] args) {
        // Example of ArithmeticException
        try {
            int a = 10;
            int b = 0;
            int result = a / b;  // This will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Cannot divide by zero!");
        }

        // Example of ArrayIndexOutOfBoundsException
        try {
            int[] numbers = {1, 2, 3};
            System.out.println("Accessing 4th element: " + numbers[3]);  // Invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Index 3 out of bounds for array.");
        }

        // Normal flow after exceptions
        System.out.println("Program continues running normally.");
    }
}
