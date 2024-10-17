class First
{
    int a;

    First(int x)
    {
        a=x;
    }
    void show()
    {
        System.out.println("Value A is "+a);
    }
}
class Second extends First
{
    int b;

    Second(int x,int y)
    {
        super(x);
        b=y;
    }
    void showdata()
    {
        System.out.println("Value B is "+b);
    }
}
class Superex
{
    public static void main(String args[])
    {
        Second s = new Second(2,3);
        
        s.show();
        s.showdata();
    }

}