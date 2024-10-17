class Except5 
{
    static void show() throws IllegalAccessException
    {
        System.out.println("Inside Function");
        throw new IllegalAccessException("Hello");
    } 
    
    public static void main(String args[])
    {
        try
        {
        System.out.println("Inside try Block");
        show();
        }
        catch(Exception e)
        {
            System.out.println("Exception is Caught" + e);
        }    
    }
}
