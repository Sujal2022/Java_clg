 class Minimum
 {
    public static void main(String[] args) 
{
        int num1 = 30; // First number
        int num2 = 40; // Second number
        int num3 = 10; // Third number

        // Initialize the minimum value with the first number
        int min = num1;

        // Compare the second number with the current minimum
        if (num2 < min) {
            min = num2;
        }

        // Compare the third number with the current minimum
        if (num3 < min) {
            min = num3;
        }

        // Display the minimum value
        System.out.println("The minimum value among the three numbers is: " + min);
    }
}