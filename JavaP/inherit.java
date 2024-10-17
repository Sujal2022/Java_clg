// Inheritance Addition

class First
{
    int a;

    void get(int x)
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

    void gets(int y)
    {
        b=y;
    }

    void disp()
    {
        System.out.println("Second Value = " + b);
    }

    void sum()
    {
        int c=a+b;
        System.out.println("Sum = " + c);
    }
}


class inherit 
{
    public static void main(String args[]) 
    {
     Second t=new Second();
     
     t.get(6);
     t.show();
     t.gets(8);
     t.disp();
     t.sum();
    }    
}
