import java.util.Scanner;

class OddEven
{
    public static void main(String args[])
    {
        Scanner t = new Scanner(System.in);
        int a;

        System.out.print("Enter a Value:");
        a=t.nextInt();

        if(a%2==0)
        System.out.println("Number is Even");
        else
        System.out.println("Number is Odd");
    }
}