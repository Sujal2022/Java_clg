package p1;

public class Marks 
{
    public String n;
    public int a,b;

    public void get(String x,int y,int z)
    {
        n=x;
        a=y;
        b=z;
    }

    public void disp()
    {
        System.out.println("Name = " + n);
        System.out.println("Age = " + a);
        System.out.println("Roll No = " + b);
    }
}
