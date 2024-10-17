class Calculator 
{
     int add(int a, int b) 
    {
        return a + b;
    }
}

// Derived class
class SumCalculator extends Calculator {
    
    public void displaySum(int a, int b) 
    {
        int result = add(a, b);  
        System.out.println("The sum of " + a + " and " + b + " is: " + result);
    }
}

// Main class
public class Singleinheriex 
{
    public static void main(String[] args) 
    {
       
        SumCalculator calculator = new SumCalculator();
        calculator.displaySum(20, 20);
    }
}
