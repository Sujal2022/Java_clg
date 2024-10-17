import p1.Var;

class Add extends Var
{
    int b = 4;

    void disp()
    {
        System.out.println("Second Value = " + b);
    }

    void sum()
    {
        int c = a+b;
        System.out.println("Sum = "+c);

    }
}
class PackAdd
{
    public static void main(String args[])
    {
        Add a=new Add();
        
        a.show();
        a.disp();
        a.sum();
    }
} 