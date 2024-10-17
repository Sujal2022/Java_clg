final class First
{
    final int a;

    void get(int x)
    {
        a=x;
    }

    final void show()
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

    void show()
    {
        System.out.println("Second Value = " + b);
    }

}

class finals 
{
    public static void main(String[] args) 
    {
        Second t=new Second();
     
        t.get(6);
        t.show();
        t.gets(8);
        t.show();
        
    }
}
