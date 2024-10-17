class Simplecml
{
    public static void main(String[] args) 
    {
        // Check if exactly three arguments are provided
        if (args.length != 3) {
            System.out.println("Please provide exactly three arguments: principal, rate, and time.");
            return;
        }

        try {
            // Parse the command-line arguments to double
            double principal = Double.parseDouble(args[0]);
            double rate = Double.parseDouble(args[1]);
            double time = Double.parseDouble(args[2]);

            // Calculate the simple interest
            double simpleInterest = (principal * rate * time) / 100;

            // Display the result
            System.out.println("Principal: " + principal);
            System.out.println("Rate of Interest: " + rate);
            System.out.println("Time: " + time);
            System.out.println("Simple Interest: " + simpleInterest);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide valid numbers for principal, rate, and time.");
        }
    }
}