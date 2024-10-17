interface First
{
    final double pi=3.14;
}
class Second implements First
{
    int r;
    void get(int y)
    {
        r=y;
    }
    void disp()
    {
        System.out.println("Enter r value: "+r);
    }
    void res()
    {
        double ans = pi*r*r;
        System.out.println("Ans is "+ans);
    }
}
class Area1
{
    public static void main(String args[])
    {
        Second s = new Second();
        s.get(4);
        s.disp();
        s.res();
    }
}