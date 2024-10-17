import p1.Test;

class Second extends Test
{
    void disp()
    {
        System.out.println("Second Class");
    }
}

class Pack
{
    public static void main(String args[])
    {
        Second s=new Second();

        s.show();
        s.disp();
    }
}
