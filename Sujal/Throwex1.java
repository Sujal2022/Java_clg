class Throwex1
{
    public static void main(String args[])
    {
        System.out.println("Throwing Exception......");
   

    try
    {
        throw new ArithmeticException("Divide by Zero");
        //throw new ArithmeticException(" ");
    }
    catch(ArithmeticException ae)
    {
        System.out.println("Exception is "+ae);
    }
    }
}