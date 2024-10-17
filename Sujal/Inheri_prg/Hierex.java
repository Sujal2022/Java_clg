class First
{
    int a;

    void get(int x)
    {
        a=x;
    }
    void show()
    {
        System.out.println("A Value is "+a);
    }
}

class Second extends First
{
    void square()
    {
        int sq = a*a;
        System.out.println("Sqaure is "+sq);
    }
}

class Third extends First
{
    void cube()
    {
        int cu = a*a*a;
        System.out.println("Cube is "+cu);
    }
}

class Hierex
{
    public static void main(String args[])
    {
        Third t = new Third();
        Second s = new Second();
        
        t.get(5);
        t.show();
        t.cube();

        s.get(5);
        //s.show();
        s.square();
        
    }
}