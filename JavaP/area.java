// Method Overloading 

class output
{
    static double pi=3.14;
    double r;
    int l,b;

    void result(int x,int y)
    {
        l=x;
        b=y;

        int s=l*b;
        System.out.println("Area of Rectangle  = " + s);
    }

    void result(double x)
    {
        r=x;

        double c=pi*r*r;
        System.out.println("Area of Circle = " + c);
    }

    void result(int x)
    {
        l=x;

        int a=l*l;
        System.out.println("Area of Square = " + a);
    }

}

class area
{
    public static void main(String args[])
    {
        output o=new output();

        o.result(4,5);
        o.result(5.25);
        o.result(6);
    }
}
