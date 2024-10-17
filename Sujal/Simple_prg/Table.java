class Table
 {
    public static void main(String[] args) 
{
        int number = 25; // Given number for which the table is to be displayed
      

        // Print the multiplication table for the given number
        System.out.println("Multiplication table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }
    }
}