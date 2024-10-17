class Factorialcml
{
    public static void main(String[] args) 
    {
        // Check if exactly one argument is provided
        if (args.length != 1) {
            System.out.println("Please provide exactly one argument: the number to compute the factorial for.");
            return;
        }

        try {
            // Parse the command-line argument to an integer
            int number = Integer.parseInt(args[0]);

            // Check if the number is non-negative
            if (number < 0) {
                System.out.println("Factorial is not defined for negative numbers.");
                return;
            }

            // Calculate the factorial
            long factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            // Display the result
            System.out.println("Factorial of " + number + " is: " + factorial);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide a valid integer.");
        }
    }
}