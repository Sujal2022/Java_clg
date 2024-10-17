// Hierarchical Inheritance Square & Cube

class First
{
    int b;
    
    void roll(int g)
    {
        b=g;
    }

    void show()
    {
        System.out.println("Number = " + b);
    }
}

class Second extends First
{

    void disp()
    {
      int sq=b*b;
      System.out.println("Square = "+sq);
    }
}

class Third extends First
{
    void res()
    {
      int cube=b*b*b;
      System.out.println("Cube = "+cube);
    }
}


class hierarchical
{
    public static void main(String args[]) 
    {
    Second t=new Second();
    Third s=new Third();
     
     t.roll(4);
     t.show();
     t.disp();
     s.roll(5); 
     s.show();
     s.res();
    } 
    
}

