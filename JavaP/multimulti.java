// Multilevel Inheritance Multiplication

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


}

class Third extends Second
{
    void mul()
    {
        int c=a*b;
        System.out.println("Multiplication = " + c);
    }
}


public class multimulti 
{
    public static void main(String args[]) 
    {
    Third t=new Third();
     
     t.get(6);
     t.show();
     t.gets(9);
     t.disp();
     t.mul();
    } 
    
}

