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
    int b;

    void getdata(int y)
    {
        b=y;
       
    }
    void showdata()
    {
        System.out.println("B Value is "+b);
        
    }
    
   
}
class Third extends Second
{
    void mul()
    {
        int ans = a*b;
        System.out.println("Answer is "+ans);
    }
}

class Multiplyex
{
    public static void main(String args[])
    {
         Third s = new Third();

        s.get(20);
        s.show();
        s.getdata(20);
        s.showdata();
        s.mul();
    }
   
}