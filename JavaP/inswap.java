// Inheritance Swapping

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

    void swap()
    {
        int c=a;
        a=b;
        b=c;

        System.out.println("After Swapping");

        System.out.println("First Value = "+a);
        
        System.out.println("Second Value = "+b);
    }
}


class inswap
{
    public static void main(String args[]) 
    {
     Second t=new Second();
     
     t.get(6);
     t.show();
     t.gets(8);
     t.disp();
     t.swap();
    }  
    
}
