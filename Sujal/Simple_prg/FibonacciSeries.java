 class FibonacciSeries 
{
    public static void main(String[] args) 
{
        int limit = 50; // Given number, up to which the Fibonacci series should be displayed

        // Initializing the first two Fibonacci numbers
        int a = 0;
        int b = 1;

        System.out.println("Fibonacci series up to " + limit + ":");

        // Print the Fibonacci series while the current number is less than or equal to the limit
        while (a <= limit) {
            System.out.print(a + " ");

            // Calculate the next Fibonacci number
            int next = a + b;
            a = b;
            b = next;
        }

        System.out.println(); // Newline for clean output
    }
}