import java.util.Scanner;

class FactorialEx
{
    public static void main(String args[])
    {
        Scanner t=new Scanner(System.in);
        int a,f=1;

        System.out.print("Enter a Value:");
        a=t.nextInt();

        for(int i=1;i<=a;i++)
        {
        f=f*i;
        }
        System.out.println("Factorial of " + a + ": " + f);
    }
}