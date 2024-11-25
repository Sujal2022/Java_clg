import java.util.Scanner;


class RunTime
{
    public static void main(String args[])
    {
        Scanner t=new Scanner(System.in);
        int a;
        float b,c;
        System.out.print("Enter First Value = ");
        a=t.nextInt();
        System.out.print("Enter Second Value = ");
        b=t.nextFloat();
        c=a+b;
        System.out.println("Sum = "+c);
    }
}