 class SumOfDigits
 {
    public static void main(String[] args) 
{
        int number = 12345; // Given number
        int sum = 0;

        // Copy the original number to a temporary variable for processing
        int temp = number;

        // Loop to extract and sum the digits
        while (temp > 0) {
            // Get the last digit
            int digit = temp % 10;
            // Add the digit to the sum
            sum += digit;
            // Remove the last digit from temp
            temp /= 10;
        }

        // Display the result
        System.out.println("The sum of the digits of " + number + " is: " + sum);
    }
}