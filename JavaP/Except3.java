class Except3
{
    public static void main(String args[]) 
    {
        int a,b;
        
        try
        {
            a=Integer.parseInt(args[0]);
            b=Integer.parseInt(args[1]);
            int c=a/b;

        System.out.println("Division = "+c);
        }
        catch(ArrayIndexOutOfBoundsException ae)
        {
            System.out.println("We have to provide value at runtime.");
        }
        catch(ArithmeticException e)
        {
            System.out.println("We can't divide number by 0");
        }

    }    
}
