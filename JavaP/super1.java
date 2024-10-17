// Super

class First
{
    int a;

    First(int x)
    {
        a=x;
    }

    void show()
    {
        System.out.println("First Value = " + a);
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

    void disp()
    {
        System.out.println("Second Value = " + b);
    }

}

class super1 
{
    public static void main(String args[]) 
    {
     Second t=new Second(5,6);
     
     
     t.show();
     t.disp();
     
    }    
}
