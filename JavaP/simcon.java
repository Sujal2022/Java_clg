class interest
{
    int p,n;
    double r;

    interest(int x,double y,int z)
    {
        p=x;
        r=y;
        n=z;
    }

   void res()
    {
        double i=(p*r*n)/100;
        System.out.println("Simple Interest = " + i);
    }
}

class simcon 
{
    public static void main(String args[])
    {
        interest o=new interest(21000,4.5,7);  
        o.res();
    } 
}

