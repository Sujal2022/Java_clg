// Command Line Value

class cmLine1 
{
    public static void main(String args[])
    {
        int a,b;

        a=Integer.parseInt(args[0]);
        b=Integer.parseInt(args[1]);

        int c=a+b;

        System.out.println("Sum is " + c);
    }    
}
