class Except4
{
    public static void main(String args[]) 
    {
        
        try
        {
            throw new ArithmeticException("Divide by 0");
        }
        catch(ArithmeticException ae)
        {
            System.out.println("Exception is " + ae);
        }
    }    
}
