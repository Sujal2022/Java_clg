class First 
{
    // Declaring a final variable
    final int MAX_AGE = 100;

    public void displayMaxAge() {
        // MAX_AGE = 110;  // This will cause a compile-time error
        System.out.println("Max age is: " + MAX_AGE);
    }
}
class FinalVarex
{    
    public static void main(String[] args) 
    {
        First example = new First();
        example.displayMaxAge();
    }
}
