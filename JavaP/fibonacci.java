class fibonacci 
{
    public static void main(String args[])
    {
        int a=0,b=1,n=10;

        if(n==0)
        System.out.println("Invalid Choice");
        else if(n==1)
        System.out.print(a);
        else
        System.out.print(a + " " + b);

        for(int i=3;i<=n;i++)
        {
            int s=a+b;
            System.out.print(" " + s);
            a=b;
            b=s;
        }
    }  
}
