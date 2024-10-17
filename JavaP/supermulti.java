// Super Multilevel Inheritance

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

class Third extends Second
{
    Third(int x,int y)
    {
        super(x,y);
    }

    void mul()
    {
        int c = a*b;
        System.out.println("Multiplication = " + c);
    }
}

class supermulti 
{
    public static void main(String args[]) 
    {
     Third t=new Third(5,6);
     
     
     t.show();
     t.disp();
     t.mul();
     
    }  
}
