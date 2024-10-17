class MyException extends Exception
{
    MyException(String nm)
    {
        super(nm);
        System.out.println("Inside Exception");
    }
}


class ExceptUser 
{
    public static void main(String args[]) 
    {
        int a=5,b=10;
        
        try
        {
            float c=a/b;
            if(c<1)
            {
                System.out.println("Inside try block");
                throw new MyException("Result is smaller than value");
            }
            
        }
        catch(MyException e)
        {
            System.out.println("Caught Exception");
            System.out.println(e.getMessage());
        }

        finally
        {
            System.out.println("Error Solution");
        }
        
           
    }
}
