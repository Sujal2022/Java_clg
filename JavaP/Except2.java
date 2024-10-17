class Except2
{
    public static void main(String args[]) 
    {
        int a=10;
        
        try
        {
            int c=a/0;
        System.out.println("Division = "+c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("We can't divide number by 0");
        }

    }    
}
