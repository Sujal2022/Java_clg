class Throwex2
{
    static void show() throws IllegalAccessException
    {
        System.out.println("Inside Function");
        throw new IllegalAccessException("hello");
    }
    public static void main(String args[])
    {
        try
        {
            System.out.println("Inside try block");
            show();
        }
        catch(Exception e)
        {
            System.out.println("Exception is Caught");
            System.out.println("Exception is Caught "+e);
        }
        
    }
}