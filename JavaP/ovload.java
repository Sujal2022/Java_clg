// Method Overloading 

class output
{
    int a,b,c;

    void sum(int x,int y)
    {
        a=x;
        b=y;

        int t=a+b;
        System.out.println("Result = " + t);
    }

    void sum(int x,int y,int z)
    {
        a=x;
        b=y;
        c=z;

        int t=a+b+c;
        System.out.println("Result = " + t);
    }

}

class ovload 
{
    public static void main(String args[])
    {
        output o=new output();

        o.sum(4,5);
        o.sum(5,8,9);
    }
}
